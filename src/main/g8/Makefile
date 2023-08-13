help:     ## Show this help.
	@sed -ne '/@sed/!s/## //p' \$(MAKEFILE_LIST)

all: $filename$.pdf ## build all targets

$filename$.pdf: $filename$.tex Chapters/*.tex FrontBackmatter/*.tex myBibliography9.bib ## Build $filename$.tex
	@latexmk -pdflatex $filename$.tex

clean: ## remove target
	@rm -f category-book.pdf





