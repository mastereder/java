------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:



List<String> list1 = new ArrayList<String>();
list1.add( "Eva" );
list1.add( 0, "Charisma" );
list1.add( "Pallas" );

List<String> list2 = Arrays.asList( "Tina", "Wilhelmine" );
list1.addAll( 3, list2 );
list1.add( "XXX" );
list1.set( 5, "Eva" );

System.out.println( list1 );        // [Charisma, Eva, Pallas, Tina, Umbruch
                            // Wilhelmine, Eva]
System.out.println( list1.size() ); // 6


System.out.println( list1 );     // [Charisma, Eva, Pallas, Tina, Wilhelmine, Eva]

boolean b = list1.contains( "Tina" );
System.out.println( b );            // true

b = list1.containsAll( Arrays.asList( "Tina", "Eva" ) );
System.out.println( b );            // true

Object o = list1.get( 1 );
System.out.println( o );            // Eva

int i = list1.indexOf( "Eva" );
System.out.println( i );            // 1

i = list1.lastIndexOf( "Eva" );
System.out.println( i );            // 5

System.out.println( list1.isEmpty() ); // false
list1.remove( 1 );
System.out.println( list1 );     // [Charisma, Pallas, Tina, Wilhelmine, Eva]

list1.remove( "Wilhelmine" );
System.out.println( list1 );     // [Charisma, Pallas, Tina, Eva]

list1.removeAll( Arrays.asList( "Pallas", "Eva" ) );
System.out.println( list1 );     // [Charisma, Tina]

list1.clear();
System.out.println( list1 );     // []
    }


---- 


int i; // die Laufvariable
for(i = 5; i <= 10; i = i + 1)
{
    // ausgeführter Code der die Laufvariable i verwenden kann, zB.
    System.out.println("i = "+i);
}


