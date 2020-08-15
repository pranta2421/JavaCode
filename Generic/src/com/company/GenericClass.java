package com.company;

 class GenericClass<T> {
     public T getName() {
         return name;
     }

     public void setName(T name) {
         this.name = name;
     }

     public T getPassword() {
         return password;
     }

     public void setPassword(T password) {
         this.password = password;
     }

     private T name;
     private T password;

     public GenericClass(T name, T password) {
         this.name = name;
         this.password = password;
     }
 }
