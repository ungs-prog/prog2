(require 'package)
(setq package-archives '(("org" . "http://orgmode.org/elpa/")
                         ("melpa" . "https://melpa.org/packages/")))
(package-initialize)
(package-refresh-contents)

;; TODO: do not reinstall every time.
(package-install 'org)
(package-install 'htmlize)
