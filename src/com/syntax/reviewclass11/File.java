package com.syntax.reviewclass11;


    public abstract class File {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while
    open is an abstract. Create 3 subclasses:
    JavaFile, WordFile, PdfFile that will provide specific
    implementation of open behaviour: Example: to open .java file
    we need notepad++ or sublime text, to open .doc file we need
    Microsoft word to be installed etc
     */

        public void Edit() {
            System.out.println("Editing the file");
        }
        public void close() {
            System.out.println("File closed");
        }
        public abstract void open();
    }
    class JavaFile extends File {
        @Override
        public void open() {
            System.out.println("to open .java file we need notepad++ or sublime text");
        }
    }
    class WordFile extends File {
        @Override
        public void open() {
            System.out.println("to open .doc file we need Microsoft word to be installed");
        }
    }
    class PdfFile extends File implements CheckInterfaceOne, CheckInterfaceTwo {

        @Override
        public void open() {
            System.out.println("to open .pdf file we need Acrobat Reader to be installed");
        }

        @Override
        public void testMethod() {

        }

        @Override
        public void testMethodInSecondInterface() {

        }
    }

