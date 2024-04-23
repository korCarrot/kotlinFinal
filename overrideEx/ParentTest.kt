package overrideEx

fun main(){
//    var parent:Parent=Parent();
//    parent.hi()

    var child:Child=Child();

//    child.hi()

   println(child.name);
   child.name="hong3"
    println(child.name);

}