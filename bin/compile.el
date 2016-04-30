(setq org-export-allow-bind-keywords t)
(setq org-html-htmlize-output-type 'css)
(setq org-publish-project-alist
     '(("prog2-html"
        :base-directory "."
        :base-extension "org"
        :publishing-directory ".publish"
        :recursive t
        :publishing-function org-html-publish-to-html)
       ("prog2-static"
        :base-directory "."
        :base-extension "java\\|html\\|css\\|js\\|png\\|jpg\\|pdf"
        :publishing-directory ".publish"
        :recursive t
        :exclude "bin\\|.repo\\|.publish"
        :publishing-function org-publish-attachment)
       ("prog2-src"
        :base-directory "."
        :base-extension "org"
        :publishing-directory ".publish/src/ungs"
        :recursive t
        :publishing-function ungs/org-babel-tangle-publish)
       ("prog2"
        :components ("prog2-html" "prog2-static" "prog2-src"))))

(defun ungs/org-babel-tangle-publish (_ filename pub-dir)
  (let ((move '(lambda (f)
                 (let* ((rel (file-relative-name f default-directory))
                        (dst (concat (file-name-as-directory pub-dir)
                                     (file-name-directory rel))))
                   (unless (file-exists-p dst)
                     (make-directory dst t))
                   (rename-file f (concat (file-name-as-directory dst)
                                          (file-name-nondirectory rel)) t)))))
    (mapc move (org-babel-tangle-file filename))))

;; Needed for Emacs 24.3.
;; https://lists.gnu.org/archive/html/emacs-orgmode/2013-09/msg01250.html
(setq c-standard-font-lock-fontify-region-function
      'font-lock-default-fontify-region)

(require 'package)
(package-initialize)

(require 'org)
(org-publish-project "prog2" 'force)
