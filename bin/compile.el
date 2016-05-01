(setq org-export-allow-bind-keywords t)
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

(defun move-with-subpath (destdir fname)
  (let* ((rel (file-relative-name fname default-directory))
         (dst (concat (file-name-as-directory destdir)
                      (file-name-directory rel))))
    (unless (file-exists-p dst)
      (make-directory dst t))
    (rename-file fname (concat (file-name-as-directory dst)
                               (file-name-nondirectory rel)) t)))

(defun ungs/org-babel-tangle-publish (_ filename pub-dir)
  (mapc (apply-partially 'move-with-subpath pub-dir)
        (org-babel-tangle-file filename)))

(require 'package)
(package-initialize)

(require 'org)
(org-publish-project "prog2" 'force)
