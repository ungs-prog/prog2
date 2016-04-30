(require 'package)
(setq package-archives '(("org" . "http://orgmode.org/elpa/")))
(package-initialize)
(package-refresh-contents)

;; TODO: do not reinstall every time.
(package-install 'org)
