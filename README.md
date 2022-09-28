[![Template ci](https://github.com/alessandrocandolini/latex.classicbook.g8/actions/workflows/ci.yml/badge.svg)](https://github.com/alessandrocandolini/latex.classicbook.g8/actions/workflows/ci.yml)

# latex.classicbook.g8

Unofficial [Giter8](https://www.foundweekends.org/giter8/) template for personal book-like LaTeX notes.

For those unfamiliar with Giter8, it's a template engine written in the Scala programming language and integrated in sbt (the Scala build tool). 
There are plenty of templating tools available (eg, cookiecutter or jinjia in python, etc) but I find g8 particularly handy. You don't need familiarity with Scala to use or even contribute to the template. 

The template generates a fresh new LaTeX project based on the [classicthesis](https://ctan.org/pkg/classicthesis?lang=en) layout, inspired by one of my favourite books in typography, namely, Robert Bringhurst’s classic “The Elements of Typographic Style” (highly recommended to learn more about typography at its finest). 

The template relies on an opinionated setup, in connection with a number of other LaTeX packages that manage
1. finer typography (eg, microtype, fnpct, impnattypo, embrac, etc)
2. bibliography (biblatex, biber support, etc) 
3. math (eg, amssym, breqn, etc) 
4. and more

Some of the choices can be considered controversial (eg, `breqn`, which rarely produces optimal line breaking in equations, however sometimes I prefer to just use it to focus on the equation itself rather than about the layout of the equation; separating the "what" from the "how it's rendered" should be one of the main selling points of using LaTeX). 

This template is work-in-progress and constantly evolving: choice of the plugins, structure of the project, "hacks" (eg, the file to support euler fonts with flexysm, or the fixes to make classicthesis footnotes hyperlinked) are not always ideal, and hopefully will improve over time. So, don't rely too much on those, take some of the choices with a grain of salt, and use this template at your own risk. I setup this template mostly because i need a quick way to kick off new project from scratch without the burden of copy-paste from old notes. 

## How to use it 

You need either [sbt](https://www.scala-sbt.org/) or [g8](https://www.foundweekends.org/giter8/) installed in your system. For example, using nix 
```bash
nix-shell -p sbt 
```
On MACOS another option can be to install it via homebrew
```
brew install sbt
```

Once sbt is installed, it is possible to generate a new project using 
```
sbt new git@github.com:alessandrocandolini/latex.classicbook.g8.git --name=<name> --title=<title> --author=<project author> --force
```
This will generate a folder `name` (if not already present) and create a new project in it. 

`name` is the only mandatory option here. If you don't specify the other options, by default `title=name` and `author` is set to be my personal name. 


See http://www.foundweekends.org/giter8/usage.html#Usage for more details on how to use g8

## Contribute to the template

Giter8 crash course: 

* Giter8 generates a project that has exactly the same structure of the [src/main/g8](src/main/g8) folder
* template variables are defined in the [default.properties](src/main/g8/default.properties) file
* template variables can be accessed as `$name of the variable$` (ie, between `$`) from everywhere
* `$` is the reserved symbol, whenever you need to use a `$` for purposes other than referring to a template variable be sure to escape it as `\$`; this is a typical source of errors

A more comprehensive guide here: http://www.foundweekends.org/giter8/Contents+in+Depth.html

To test the template, giter8 provides a sbt command `g8Test`, which unfortunately has some drawbacks. For this reason, the recommended approach is to test the template by generating a fake project and try to compile with LaTeX the generated code. That's exactly what the github action CI is doing. 

Template license
----------------
Written in 2022 by Alessandro Candolini alessandro.candolini@gmail.com

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
