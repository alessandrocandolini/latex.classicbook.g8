all: $filename$.pdf


$filename$.pdf: $filename$.tex Chapters/*.tex FrontBackmatter/*.tex myBibliography9.bib
	latexmk -pdflatex $filename$.tex
