package com.syntax.Repl.Repl145;

 class Dog {

        String dogName;
        double dogWeight;
        static String dogBreed = "Mutt";

        Dog(String dogName, double dogWeight, String dogBreed) {
            this.dogName = dogName;
            this.dogWeight = dogWeight;
            Dog.dogBreed = dogBreed;
        }
        void print() {
            System.out.println(dogName+" "+dogBreed+" "+dogWeight);
        }

}
