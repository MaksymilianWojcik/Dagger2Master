# Dagger2Master


## Documentation
[Git](https://github.com/google/dagger)

## Documentation
[Doc](https://google.github.io/dagger/)

## Dependencies: 
        // Dagger
        def dagger_version = "2.22"
    
        // Dagger2 core
        implementation "com.google.dagger:dagger:$dagger_version"
        annotationProcessor "com.google.dagger:dagger-compiler:$dagger_version"
    
        // Dagger Android
        implementation "com.google.dagger:dagger-android:$dagger_version"
        implementation "com.google.dagger:dagger-android-support:$dagger_version"
        annotationProcessor "com.google.dagger:dagger-android-processor:$dagger_version"
        
        
 # Dagger component classes
 
 ## AppComponent  (@Singleton)
 Rozciaga sie na caly lifetime aplikacji.
 
 ### AppComponent.java (interfejs)
 Dodajemy adnotacje @Component bo to bedzie nasz component daggerowy.
 Dodalismy `extends AndroidInjector<BaseApplication>` bo dzieki temu nie bedziemy musieli pisac metod 
 inject() itp. Jak rozszezamy AndroidInjectora i podajemy mu BaseApllication jako parametr, to mowimy daggerowi
 ze BaseApplciation bedzie jakby clientem, a AppComponent serwisem.
 
 Generalnie bedzie tak, ze Components to serwisy, a Activity i Fragmenty to clienty.
 Oczywiscie componenty tez moga byc clientami, jak np. sa subkomponentami innego komponentu.
 
 @BindsInstance - kiedy chcemy zbindowac konkretny obiekt w trakcie konstrukcji
 
 ### BaseApplication.java
 
 Rozszerzamy DaggerApplication zamiast Application dzieku temu, ze uzywamy dependency adroidowych
 
 
 ## Activities components
 Sa na rownoleglym poziomie, ale tylko jeden aktywyny w danym czasie. Sa to subkomponenty AppComponenta. 
 


 