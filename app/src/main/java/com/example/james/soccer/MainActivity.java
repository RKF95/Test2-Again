package com.example.james.soccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this);
        addData(myDB);
    }

    public void addData(DatabaseHelper myDB) {
        myDB.insertData1("Air Bud", 1);
        myDB.insertData1("Germany", 2);
        myDB.insertData1("PCSE", 3);
        myDB.insertData1("Brazil", 4);
        myDB.insertData1("Legends", 5);
        myDB.insertData1("Argentina", 6);
        myDB.insertData1("USA", 7);
        myDB.insertData1("Spain", 8);
        myDB.insertData1("France", 9);
        myDB.insertData1("Mexico", 10);
        myDB.insertData1("Portugal", 11);
        myDB.insertData1("Trump", 12);
        myDB.insertData1("Trible", 13);
        myDB.insertData1("Hilary", 14);
        myDB.insertData1("NBA All Stars", 15);
        myDB.insertData1("New England Patriots", 16);

        myDB.insertData2("Air Bud", "Air", "Bud", "ST", 26, 99, 99, 99, 99, 99, 99, 99, 99, 0, 1);
        myDB.insertData2("Air Bud", "Brian", "Griffin", "CB", 20, 79, 60, 30, 70, 60, 70, 70, 99, 0, 1);
        myDB.insertData2("Air Bud", "", "Pluto", "CM", 32, 83, 87, 75, 80, 60, 70, 75, 80, 0, 1);
        myDB.insertData2("Air Bud", "Scooby", "Doo", "CAM", 25, 88, 93, 80, 87, 80, 40, 70, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Blue", "RB", 20, 78, 80, 50, 75, 78, 79, 64, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Benji", "CDM", 20, 82, 80, 60, 75, 78, 79, 75, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Copper", "LB", 20, 80, 84, 50, 79, 78, 80, 64, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Marley", "ST", 27, 85, 84, 80, 68, 78, 80, 64, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Snoopy", "LM", 18, 80, 84, 80, 81, 78, 40, 64, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Bambi", "RM", 13, 84, 94, 80, 81, 88, 40, 34, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Pluto", "GK", 28, 60, 94, 80, 81, 88, 40, 34, 80, 60, 1);
        myDB.insertData2("Air Bud", "", "Beethoven", "CB", 28, 83, 84, 30, 71, 58, 85, 84, 80, 0, 1);
        myDB.insertData2("Air Bud", "Old", "Yeller", "ST", 18, 76, 84, 80, 61, 78, 45, 64, 70, 0, 1);
        myDB.insertData2("Air Bud", "", "Lassie", "LB", 20, 80, 84, 30, 75, 68, 80, 70, 80, 0, 1);
        myDB.insertData2("Air Bud", "", "Clifford", "GK", 90, 98, 84, 30, 75, 68, 80, 70, 80, 98, 1);
        myDB.insertData2("Air Bud", "", "Comet", "RM", 25, 70, 74, 70, 75, 68, 80, 70, 80, 50, 1);

        myDB.insertData2("Germany", "Manuel", "Neuer", "GK", 76, 93, 84, 80, 68, 78, 80, 64, 80, 93, 2);
        myDB.insertData2("Germany", "Jerome", "Boateng", "CB", 76, 92, 84, 40, 68, 78, 90, 90, 80, 0, 2);
        myDB.insertData2("Germany", "Matts", "Hummels", "CB", 76, 88, 75, 40, 68, 60, 89, 90, 80, 0, 2);
        myDB.insertData2("Germany", "Philip", "Lahm", "RB", 60, 88, 70, 50, 80, 75, 78, 60, 99, 0, 2);
        myDB.insertData2("Germany", "Marco", "Reus", "LM", 70, 87, 90, 75, 85, 90, 60, 85, 70, 0, 2);
        myDB.insertData2("Germany", "Mario", "Gomez", "ST", 74, 82, 60, 83, 60, 70, 30, 85, 80, 0, 2);
        myDB.insertData2("Germany", "Lukas", "Podolski", "RM", 70, 83, 75, 88, 70, 80, 60, 80, 70, 0, 2);
        myDB.insertData2("Germany", "Mesut", "Ozil", "CAM", 65, 88, 75, 80, 89, 87, 60, 60, 90, 0, 2);
        myDB.insertData2("Germany", "Mario", "Gotze", "CAM", 60, 83, 75, 78, 84, 87, 60, 60, 80, 0, 2);
        myDB.insertData2("Germany", "Sami", "Khedira", "CDM", 74, 83, 65, 78, 80, 70, 78, 84, 80, 0, 2);
        myDB.insertData2("Germany", "Brand", "Leno", "GK", 74, 83, 65, 78, 80, 70, 78, 84, 80, 86, 2);
        myDB.insertData2("Germany", "Jonas", "Hector", "LB", 69, 80, 80, 70, 71, 70, 78, 80, 74, 0, 2);
        myDB.insertData2("Germany", "Joshua", "Kimich", "CM", 69, 78, 70, 65, 76, 70, 78, 70, 80, 0, 2);
        myDB.insertData2("Germany", "Timo", "Werner", "ST", 65, 78, 93, 72, 60, 75, 50, 67, 70, 0, 2);
        myDB.insertData2("Germany", "Julian", "Draxler", "CAM", 71, 84, 78, 81, 83, 85, 50, 70, 80, 0, 2);
        myDB.insertData2("Germany", "Thomas", "Muller", "CAM", 71, 88, 78, 86, 80, 79, 50, 77, 90, 0, 2);

        myDB.insertData2("PCSE", "Micheal", "Johnson", "GK", 76, 90, 24, 20, 28, 28, 20, 24, 20, 90, 3);
        myDB.insertData2("PCSE", "David", "Brash", "CB", 70, 86, 80, 40, 68, 68, 87, 80, 80, 0, 3);
        myDB.insertData2("PCSE", "Micheal", "Collins", "CB", 72, 88, 75, 40, 68, 60, 89, 70, 80, 0, 3);
        myDB.insertData2("PCSE", "Anton", "Riedl", "RB", 65, 96, 90, 50, 80, 75, 88, 80, 99, 0, 3);
        myDB.insertData2("PCSE", "Roberto", "Flores", "LM", 70, 84, 86, 75, 85, 90, 60, 65, 70, 0, 3);
        myDB.insertData2("PCSE", "Costa", "Gerousis", "ST", 68, 98, 98, 98, 98, 98, 98, 98, 98, 0, 3);
        myDB.insertData2("PCSE", "Aaron", "Koehl", "RM", 70, 88, 95, 85, 80, 85, 60, 80, 80, 0, 3);
        myDB.insertData2("PCSE", "David", "Heedle", "CAM", 65, 88, 75, 80, 89, 87, 60, 60, 90, 0, 3);
        myDB.insertData2("PCSE", "Anton", "Siochi", "CAM", 65, 83, 75, 78, 84, 87, 60, 60, 80, 0, 3);
        myDB.insertData2("PCSE", "Anna", "DeJong", "CDM", 59, 83, 85, 78, 80, 70, 78, 84, 80, 0, 3);
        myDB.insertData2("PCSE", "Lynn", "Lambert", "GK", 86, 83, 65, 78, 80, 70, 78, 84, 80, 86, 3);
        myDB.insertData2("PCSE", "Keith", "Perkins", "LB", 69, 90, 80, 70, 71, 70, 88, 80, 94, 0, 3);
        myDB.insertData2("PCSE", "Ming", "Zhang", "CM", 69, 78, 70, 65, 76, 70, 78, 70, 80, 0, 3);
        myDB.insertData2("PCSE", "Dali", "Wang", "ST", 65, 78, 93, 72, 60, 75, 50, 67, 70, 0, 3);
        myDB.insertData2("PCSE", "Charles", "Samuels", "CAM", 71, 84, 78, 81, 83, 85, 50, 70, 80, 0, 3);
        myDB.insertData2("PCSE", "Claire", "Maliniak", "CAM", 71, 88, 78, 86, 80, 79, 50, 77, 90, 0, 3);

        myDB.insertData2("Brazil", "Julio", "Cesar", "GK", 70, 82, 24, 20, 28, 28, 20, 24, 20, 82, 4);
        myDB.insertData2("Brazil", "Thiago", "Silva", "CB", 70, 88, 80, 40, 68, 68, 87, 80, 80, 0, 4);
        myDB.insertData2("Brazil", "David", "Luiz", "CB", 72, 84, 75, 40, 68, 60, 83, 80, 80, 0, 4);
        myDB.insertData2("Brazil", "Dani", "Alves", "RB", 68, 86, 90, 70, 80, 75, 80, 70, 80, 0, 4);
        myDB.insertData2("Brazil", "", "Neymar", "LM", 60, 92, 91, 85, 80, 80, 60, 65, 90, 0, 4);
        myDB.insertData2("Brazil", "Roberto", "Firmino", "ST", 72, 85, 76, 82, 74, 86, 78, 78, 78, 0, 4);
        myDB.insertData2("Brazil", "", "Hulk", "RM", 70, 86, 85, 90, 77, 83, 60, 90, 80, 0, 4);
        myDB.insertData2("Brazil", "Philip", "Coutinho", "CAM", 65, 87, 79, 84, 86, 87, 60, 60, 85, 0, 4);
        myDB.insertData2("Brazil", "Thiago", "Neves", "CAM", 71, 82, 60, 88, 80, 82, 60, 70, 85, 0, 4);
        myDB.insertData2("Brazil", "Luis", "Gustavo", "CDM", 72, 84, 75, 78, 70, 70, 84, 84, 80, 0, 4);
        myDB.insertData2("Brazil", "Diego", "Alves", "GK", 82, 83, 65, 78, 80, 70, 78, 84, 80, 83, 4);
        myDB.insertData2("Brazil", "", "Marcelo", "LB", 69, 85, 80, 70, 71, 70, 80, 70, 80, 0, 4);
        myDB.insertData2("Brazil", "Ze", "Roberto", "CM", 65, 75, 60, 85, 76, 80, 68, 70, 80, 0, 4);
        myDB.insertData2("Brazil", "", "Jonas", "ST", 65, 84, 80, 82, 60, 75, 50, 77, 80, 0, 4);
        myDB.insertData2("Brazil", "", "Ronaldinho", "CAM", 71, 91, 68, 88, 89, 93, 50, 65, 90, 0, 4);
        myDB.insertData2("Brazil", "", "Oscar", "CAM", 62, 82, 78, 82, 80, 79, 50, 77, 90, 0, 4);

        myDB.insertData2("Legends", "Oliver", "Kahn", "GK", 75, 95, 54, 20, 28, 28, 20, 24, 20, 95, 5);
        myDB.insertData2("Legends", "Franz", "Beckenbauer", "CB", 68, 95, 80, 40, 78, 68, 97, 80, 99, 0, 5);
        myDB.insertData2("Legends", "Carles", "Puyol", "CB", 67, 92, 75, 40, 68, 60, 93, 90, 90, 0, 5);
        myDB.insertData2("Legends", "Gary", "Nevile", "RB", 72, 87, 80, 70, 80, 75, 85, 70, 80, 0, 5);
        myDB.insertData2("Legends", "Pavel", "Nedeved", "LM", 70, 92, 88, 85, 88, 86, 60, 75, 90, 0, 5);
        myDB.insertData2("Legends", "", "Pele", "ST", 68, 97, 96, 92, 74, 96, 78, 78, 98, 0, 5);
        myDB.insertData2("Legends", "Edward", "Kryuff", "RM", 70, 93, 85, 93, 77, 88, 60, 90, 90, 0, 5);
        myDB.insertData2("Legends", "Ruud", "Gullit", "CAM", 75, 89, 89, 85, 86, 87, 60, 80, 85, 0, 5);
        myDB.insertData2("Legends", "Jayjay", "Okocha", "CAM", 68, 88, 80, 88, 88, 88, 60, 70, 85, 0, 5);
        myDB.insertData2("Legends", "Patrick", "Viera", "CDM", 72, 88, 75, 78, 70, 70, 89, 89, 84, 0, 5);
        myDB.insertData2("Legends", "Jens", "Lehman", "GK", 75, 88, 65, 78, 80, 70, 78, 84, 80, 88, 5);
        myDB.insertData2("Legends", "Roberto", "Carlos", "LB", 69, 89, 88, 80, 81, 70, 84, 70, 80, 0, 5);
        myDB.insertData2("Legends", "Luther", "Matheus", "CM", 70, 90, 80, 90, 86, 78, 88, 80, 99, 0, 5);
        myDB.insertData2("Legends", "Roy", "Makaay", "ST", 71, 89, 87, 88, 60, 85, 50, 80, 92, 0, 5);
        myDB.insertData2("Legends", "Rui", "Costa", "CAM", 68, 87, 68, 86, 85, 90, 50, 65, 86, 0, 5);
        myDB.insertData2("Legends", "Micheal", "Laudrop", "CAM", 69, 88, 88, 85, 80, 79, 50, 77, 90, 0, 5);

        myDB.insertData2("Argentina", "Sergio", "Romero", "GK", 75, 85, 54, 20, 28, 28, 20, 24, 20, 85, 6);
        myDB.insertData2("Argentina", "Nicolas", "Otamendi", "CB", 72, 86, 80, 40, 78, 68, 87, 80, 79, 0, 6);
        myDB.insertData2("Argentina", "Martin", "Demichelis", "CB", 72, 75, 55, 40, 68, 60, 83, 90, 90, 0, 6);
        myDB.insertData2("Argentina", "Pablo", "Zabaleta", "RB", 70, 83, 70, 60, 70, 75, 85, 70, 80, 0, 6);
        myDB.insertData2("Argentina", "Ezquiel", "Lavezi", "LM", 66, 82, 88, 75, 78, 86, 60, 65, 70, 0, 6);
        myDB.insertData2("Argentina", "Lionel", "Messi", "ST", 68, 98, 99, 97, 84, 99, 58, 68, 98, 0, 6);
        myDB.insertData2("Argentina", "Juan", "Iturbe", "RM", 63, 81, 85, 73, 72, 86, 60, 50, 70, 0, 6);
        myDB.insertData2("Argentina", "Angel", "Di Maria", "CAM", 68, 87, 89, 82, 84, 90, 60, 60, 75, 0, 6);
        myDB.insertData2("Argentina", "Sergio", "Aguero", "ST", 68, 88, 90, 88, 88, 88, 60, 70, 85, 0, 6);
        myDB.insertData2("Argentina", "Esteben", "Cambiasso", "CDM", 72, 78, 65, 68, 70, 70, 85, 79, 74, 0, 6);
        myDB.insertData2("Argentina", "", "Muslera", "GK", 65, 78, 65, 78, 80, 70, 78, 84, 80, 78, 6);
        myDB.insertData2("Argentina", "Christian", "Ansaldi", "LB", 70, 80, 82, 60, 71, 70, 80, 70, 70, 0, 6);
        myDB.insertData2("Argentina", "Enzo", "Perez", "CM", 70, 80, 80, 70, 76, 78, 80, 70, 90, 0, 6);
        myDB.insertData2("Argentina", "Gonzalo", "Higuain", "ST", 71, 88, 80, 88, 60, 82, 50, 80, 92, 0, 6);
        myDB.insertData2("Argentina", "Carlos", "Tevez", "CAM", 68, 86, 78, 86, 80, 80, 50, 85, 86, 0, 6);
        myDB.insertData2("Argentina", "Javier", "Pastore", "CAM", 72, 84, 70, 85, 80, 79, 50, 77, 90, 0, 6);

        myDB.insertData2("USA", "Tim", "Howard", "GK", 83, 83, 54, 20, 28, 28, 20, 24, 20, 83, 7);
        myDB.insertData2("USA", "Omar", "Gonzales", "CB", 79, 58, 80, 40, 78, 68, 87, 80, 79, 0, 7);
        myDB.insertData2("USA", "John", "Brooks", "CB", 72, 83, 75, 40, 68, 60, 83, 90, 90, 0, 7);
        myDB.insertData2("USA", "Deandre", "Yedlin", "RB", 70, 83, 90, 60, 70, 75, 75, 70, 80, 0, 7);
        myDB.insertData2("USA", "Julian", "Green", "LM", 66, 82, 88, 75, 78, 86, 60, 65, 70, 0, 7);
        myDB.insertData2("USA", "Clint", "Dempsey", "ST", 68, 85, 79, 84, 84, 79, 58, 68, 80, 0, 7);
        myDB.insertData2("USA", "Landon", "Donovan", "RM", 63, 84, 85, 73, 72, 86, 60, 50, 70, 0, 7);
        myDB.insertData2("USA", "Lee", "Nguyen", "CAM", 68, 80, 80, 82, 84, 80, 60, 60, 75, 0, 7);
        myDB.insertData2("USA", "Brian", "McBride", "ST", 68, 83, 90, 80, 80, 80, 60, 70, 70, 0, 7);
        myDB.insertData2("USA", "Jermaine", "Jones", "CDM", 72, 78, 65, 68, 70, 70, 85, 79, 74, 0, 7);
        myDB.insertData2("USA", "Brad", "Guzan", "GK", 65, 78, 65, 78, 80, 70, 78, 84, 80, 78, 7);
        myDB.insertData2("USA", "Fabian", "Johnson", "LB", 70, 80, 82, 60, 71, 70, 80, 70, 70, 0, 7);
        myDB.insertData2("USA", "Kyle", "Beckerman", "CM", 70, 80, 80, 70, 76, 78, 80, 70, 90, 0, 7);
        myDB.insertData2("USA", "Jozy", "Altidore", "ST", 71, 80, 70, 80, 60, 80, 50, 80, 92, 0, 7);
        myDB.insertData2("USA", "Brad", "Davies", "CAM", 68, 76, 68, 76, 70, 70, 50, 75, 76, 0, 7);
        myDB.insertData2("USA", "Alejandro", "Bedoya", "CAM", 72, 74, 70, 75, 70, 79, 50, 77, 70, 0, 7);

        myDB.insertData2("Spain", "Iker", "Casillas", "GK", 71, 85, 54, 20, 28, 28, 20, 24, 20, 85, 8);
        myDB.insertData2("Spain", "Sergio", "Ramos", "CB", 69, 88, 80, 40, 78, 68, 87, 80, 79, 0, 8);
        myDB.insertData2("Spain", "Gerard", "Pique", "CB", 72, 86, 65, 40, 68, 60, 86, 85, 90, 0, 8);
        myDB.insertData2("Spain", "David", "Carvajal", "RB", 62, 83, 80, 60, 76, 75, 83, 70, 80, 0, 8);
        myDB.insertData2("Spain", "", "Pedro", "LM", 66, 85, 83, 79, 78, 83, 60, 65, 70, 0, 8);
        myDB.insertData2("Spain", "Diego", "Costa", "ST", 73, 86, 79, 84, 74, 79, 58, 88, 90, 0, 8);
        myDB.insertData2("Spain", "Jesus", "Navas", "RM", 63, 83, 95, 73, 82, 86, 60, 50, 80, 0, 8);
        myDB.insertData2("Spain", "Andres", "Iniesta", "CAM", 68, 87, 75, 88, 88, 60, 60, 60, 85, 0, 8);
        myDB.insertData2("Spain", "Fernando", "Torres", "ST", 73, 81, 80, 83, 68, 80, 60, 70, 80, 0, 8);
        myDB.insertData2("Spain", "Sergio", "Busquets", "CDM", 75, 88, 65, 68, 85, 70, 85, 84, 94, 0, 8);
        myDB.insertData2("Spain", "", "Roberto", "GK", 65, 78, 65, 78, 80, 70, 78, 84, 80, 78, 8);
        myDB.insertData2("Spain", "Jordi", "Alba", "LB", 68, 86, 92, 60, 81, 70, 90, 70, 70, 0, 8);
        myDB.insertData2("Spain", "Xabi", "Alonso", "CM", 68, 85, 55, 90, 76, 78, 80, 70, 90, 0, 8);
        myDB.insertData2("Spain", "David", "Aduriz", "ST", 69, 84, 70, 78, 70, 82, 50, 80, 92, 0, 8);
        myDB.insertData2("Spain", "", "Isco", "CAM", 68, 86, 78, 86, 80, 80, 50, 85, 86, 0, 8);
        myDB.insertData2("Spain", "Santi", "Cazorla", "CAM", 68, 84, 70, 85, 80, 79, 50, 77, 90, 0, 8);

        myDB.insertData2("France", "Hugo", "Lloris", "GK", 73, 88, 54, 20, 28, 28, 20, 24, 20, 88, 9);
        myDB.insertData2("France", "Raphael", "Varane", "CB", 75, 84, 80, 40, 68, 68, 85, 85, 79, 0, 9);
        myDB.insertData2("France", "Laurent", "Koscionly", "CB", 70, 85, 75, 40, 68, 60, 86, 80, 90, 0, 9);
        myDB.insertData2("France", "Bacaray", "Sagna", "RB", 68, 80, 70, 70, 76, 75, 80, 70, 80, 0, 9);
        myDB.insertData2("France", "Dimitri", "Payet", "LM", 66, 86, 83, 79, 88, 85, 60, 65, 90, 0, 9);
        myDB.insertData2("France", "Alexander", "Lacazete", "ST", 70, 86, 89, 84, 74, 75, 58, 80, 85, 0, 9);
        myDB.insertData2("France", "Antonio", "Griezman", "RM", 63, 89, 90, 83, 82, 88, 60, 60, 80, 0, 9);
        myDB.insertData2("France", "Paul", "Pogba", "CAM", 74, 88, 75, 88, 85, 85, 70, 85, 85, 0, 9);
        myDB.insertData2("France", "Olivie", "Giroud", "ST", 73, 82, 70, 73, 68, 80, 60, 80, 80, 0, 9);
        myDB.insertData2("France", "Blaise", "Matuidi", "CDM", 68, 86, 75, 62, 85, 70, 84, 74, 90, 0, 9);
        myDB.insertData2("France", "Steve", "Mandanda", "GK", 70, 86, 65, 78, 80, 70, 78, 84, 80, 86, 9);
        myDB.insertData2("France", "Patrice", "Evra", "LB", 71, 80, 72, 60, 81, 70, 80, 70, 70, 0, 9);
        myDB.insertData2("France", "Ngolo", "Kante", "CM", 68, 84, 85, 70, 76, 78, 80, 70, 90, 0, 9);
        myDB.insertData2("France", "Karim", "Benzema", "ST", 71, 86, 80, 84, 70, 84, 50, 80, 82, 0, 9);
        myDB.insertData2("France", "Hatem", "Ben Arfa", "CAM", 68, 85, 78, 86, 80, 86, 50, 80, 80, 0, 9);
        myDB.insertData2("France", "Frank", "Ribery", "CAM", 68, 86, 80, 80, 86, 89, 50, 67, 90, 0, 9);

        myDB.insertData2("Mexico", "Guillermo", "Ochoa", "GK", 73, 83, 54, 20, 28, 28, 20, 24, 20, 83, 10);
        myDB.insertData2("Mexico", "Rafa", "Marquez", "CB", 75, 78, 60, 40, 68, 68, 80, 85, 79, 0, 10);
        myDB.insertData2("Mexico", "Hector", "Moreno", "CB", 70, 80, 75, 40, 68, 60, 81, 80, 70, 0, 10);
        myDB.insertData2("Mexico", "Paul", "Aguilar", "RB", 68, 80, 70, 70, 76, 75, 80, 70, 80, 0, 10);
        myDB.insertData2("Mexico", "Hirving", "Lozano", "LM", 66, 76, 73, 69, 78, 80, 60, 65, 80, 0, 10);
        myDB.insertData2("Mexico", "Javier", "Hernandez", "ST", 65, 84, 89, 84, 74, 75, 58, 80, 85, 0, 10);
        myDB.insertData2("Mexico", "Carlos", "Vela", "RM", 63, 82, 90, 83, 82, 84, 60, 60, 70, 0, 10);
        myDB.insertData2("Mexico", "Marco", "Fabian", "CAM", 70, 80, 75, 80, 80, 75, 70, 75, 75, 0, 10);
        myDB.insertData2("Mexico", "Giovani", "Dos Santos", "ST", 68, 80, 80, 73, 68, 80, 60, 80, 80, 0, 10);
        myDB.insertData2("Mexico", "Jose", "Vasquez", "CDM", 72, 75, 70, 62, 80, 60, 74, 74, 70, 0, 10);
        myDB.insertData2("Mexico", "Jonathan", "Orazco", "GK", 70, 82, 65, 78, 80, 70, 78, 84, 80, 82, 10);
        myDB.insertData2("Mexico", "Miguel", "Layun", "LB", 68, 83, 75, 70, 84, 70, 84, 70, 70, 0, 10);
        myDB.insertData2("Mexico", "Andres", "Guardado", "CM", 68, 84, 85, 70, 76, 78, 80, 70, 90, 0, 10);
        myDB.insertData2("Mexico", "Raul", "Jimenez", "ST", 71, 80, 70, 74, 70, 84, 50, 80, 82, 0, 10);
        myDB.insertData2("Mexico", "Alfonso", "Gonzales", "CAM", 68, 80, 70, 80, 80, 80, 50, 80, 80, 0, 10);
        myDB.insertData2("Mexico", "Andro", "Herrera", "CAM", 68, 76, 70, 70, 76, 79, 50, 67, 70, 0, 10);

        myDB.insertData2("Portugal", "Rui", "Patricio", "GK", 73, 83, 54, 20, 28, 28, 20, 24, 20, 83, 11);
        myDB.insertData2("Portugal", "", "Pepe", "CB", 71, 88, 80, 40, 68, 68, 90, 85, 79, 0, 11);
        myDB.insertData2("Portugal", "Jose", "Fonte", "CB", 70, 80, 75, 40, 68, 60, 81, 80, 70, 0, 11);
        myDB.insertData2("Portugal", "Ricardo", "Pereira", "RB", 68, 80, 70, 70, 76, 75, 80, 70, 80, 0, 11);
        myDB.insertData2("Portugal", "", "Nani", "LM", 66, 83, 83, 79, 78, 90, 60, 65, 80, 0, 11);
        myDB.insertData2("Portugal", "Christiano", "Ronaldo", "ST", 75, 95, 99, 94, 74, 75, 58, 85, 95, 0, 11);
        myDB.insertData2("Portugal", "Ricardo", "Quaresma", "RM", 65, 83, 90, 83, 82, 87, 60, 60, 70, 0, 11);
        myDB.insertData2("Portugal", "", "Danny", "CAM", 70, 83, 78, 83, 83, 85, 70, 75, 75, 0, 11);
        myDB.insertData2("Portugal", "", "Eder", "ST", 73, 80, 80, 73, 68, 80, 60, 80, 80, 0, 11);
        myDB.insertData2("Portugal", "William", "Carvahal", "CDM", 73, 82, 80, 72, 83, 60, 74, 84, 80, 0, 11);
        myDB.insertData2("Portugal", "Anthony", "Lopes", "GK", 70, 82, 65, 78, 80, 70, 78, 84, 80, 82, 11);
        myDB.insertData2("Portugal", "Fabio", "Coentrao", "LB", 68, 83, 75, 70, 84, 70, 84, 70, 70, 0, 11);
        myDB.insertData2("Portugal", "Renato", "Sanchez", "CM", 68, 84, 85, 70, 76, 78, 80, 70, 90, 0, 11);
        myDB.insertData2("Portugal", "Goncalo", "Guedes", "ST", 71, 80, 70, 74, 70, 84, 50, 80, 82, 0, 11);
        myDB.insertData2("Portugal", "Jao", "Moutinho", "CAM", 68, 80, 70, 80, 80, 80, 50, 80, 80, 0, 11);
        myDB.insertData2("Portugal", "", "Tiago", "CAM", 68, 76, 70, 70, 76, 79, 50, 67, 70, 0, 11);

        myDB.insertData2("Trump", "Donald", "Trump", "G", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);
        myDB.insertData2("Trump", "Donald", "Trump", "ST", 70, 85, 85, 85, 85, 85, 85, 85, 85, 85, 12);

        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);
        myDB.insertData2("Trible", "Paul", "Trible", "ST", 71, 88, 88, 88, 88, 88, 88, 88, 88, 88, 13);

        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);
        myDB.insertData2("Hillary", "Hillary", "Clinton", "ST", 60, 80, 80, 80, 80, 80, 80, 80, 80, 80, 14);

        myDB.insertData2("NBA All Stars", "Lebron", "James", "ST", 80, 80, 80, 80, 80, 80, 80, 80, 80, 0, 15);
        myDB.insertData2("NBA All Stars", "Demarcus", "Cousins", "CB", 75, 80, 70, 30, 50, 60, 73, 99, 70, 0, 15);
        myDB.insertData2("NBA All Stars", "Isiah", "Thomas", "CM", 65, 80, 95, 70, 70, 70, 70, 75, 70, 0, 15);
        myDB.insertData2("NBA All Stars", "Steph", "Curry", "CAM", 74, 71, 90, 80, 70, 70, 30, 40, 60, 0, 15);
        myDB.insertData2("NBA All Stars", "Steve", "Nash", "RB", 70, 90, 70, 95, 90, 90, 80, 60, 99, 0, 15);
        myDB.insertData2("NBA All Stars", "Dwight", "Howard", "CDM", 80, 70, 60, 70, 60, 50, 70, 99, 70, 0, 15);
        myDB.insertData2("NBA All Stars", "Chris", "Paul", "LB", 70, 73, 80, 40, 70, 80, 70, 70, 80, 0, 15);
        myDB.insertData2("NBA All Stars", "James", "Harden", "ST", 74, 81, 85, 80, 80, 80, 80, 80, 80, 0, 15);
        myDB.insertData2("NBA All Stars", "Kevin", "Durant", "LM", 77, 84, 80, 80, 80, 80, 80, 80, 80, 0, 15);
        myDB.insertData2("NBA All Stars", "Demar", "Derozan", "RM", 74, 70, 80, 80, 80, 80, 80, 80, 80, 0, 15);
        myDB.insertData2("NBA All Stars", "Dirk", "Nowitzki", "GK", 79, 86, 80, 80, 80, 80, 80, 80, 80, 86, 15);
        myDB.insertData2("NBA All Stars", "Harrison", "Barnes", "CB", 73, 76, 80, 80, 80, 80, 80, 80, 80, 0, 15);
        myDB.insertData2("NBA All Stars", "Klay", "Thompson", "ST", 71, 84, 80, 80, 80, 80, 80, 80, 80, 0, 15);
        myDB.insertData2("NBA All Stars", "Blake", "Griffin", "LB", 77, 76, 80, 30, 60, 80, 68, 70, 70, 0, 15);
        myDB.insertData2("NBA All Stars", "Kawhi", "Leonard", "GK", 76, 78, 80, 80, 80, 80, 80, 80, 80, 78, 15);
        myDB.insertData2("NBA All Stars", "Giannis", "Antemakoumbo", "RM", 76, 88, 88, 80, 88, 80, 80, 90, 60, 0, 15);

        myDB.insertData2("New England Patriots", "Rob", "Gronkowski", "ST", 78, 83, 85, 70, 60, 75, 40, 99, 80, 0, 16);
        myDB.insertData2("New England Patriots", "Chris", "Hogan", "CB", 70, 74, 70, 30, 50, 60, 73, 90, 70, 0, 16);
        myDB.insertData2("New England Patriots", "Dion", "Lewis", "CM", 65, 80, 90, 60, 75, 70, 70, 75, 70, 0, 16);
        myDB.insertData2("New England Patriots", "Tom", "Brady", "CAM", 71, 85, 60, 80, 99, 70, 30, 60, 90, 0, 16);
        myDB.insertData2("New England Patriots", "Julian", "Edelman", "RB", 65, 78, 90, 75, 80, 90, 70, 70, 89, 0, 16);
        myDB.insertData2("New England Patriots", "Jimmy", "Garoppolo", "CDM", 71, 60, 60, 50, 70, 50, 70, 80, 70, 0, 16);
        myDB.insertData2("New England Patriots", "Wes", "Welker", "LB", 65, 73, 90, 40, 70, 65, 75, 76, 80, 0, 16);
        myDB.insertData2("New England Patriots", "LeGarrete", "Blount", "ST", 68, 81, 85, 80, 50, 80, 80, 95, 70, 0, 16);
        myDB.insertData2("New England Patriots", "Malcom", "Butler", "LM", 71, 80, 85, 70, 80, 80, 80, 80, 80, 0, 16);
        myDB.insertData2("New England Patriots", "Matthew", "Slater", "RM", 70, 70, 84, 70, 80, 80, 80, 80, 80, 0, 16);
        myDB.insertData2("New England Patriots", "Stephen", "Gostkowski", "ST", 88, 86, 70, 99, 80, 80, 80, 80, 80, 0, 16);
        myDB.insertData2("New England Patriots", "Shea", "McClellin", "CB", 73, 70, 70, 70, 70, 76, 75, 95, 70, 0, 16);
        myDB.insertData2("New England Patriots", "James", "White", "ST", 68, 73, 80, 80, 80, 80, 80, 80, 80, 0, 16);
        myDB.insertData2("New England Patriots", "Michael", "Floyd", "LB", 67, 70, 80, 30, 70, 80, 68, 70, 70, 0, 16);
        myDB.insertData2("New England Patriots", "Malcom", "Mitchell", "GK", 73, 78, 80, 80, 80, 80, 80, 80, 80, 78, 16);
        myDB.insertData2("New England Patriots", "Donta", "Hightower", "RM", 70, 76, 80, 80, 80, 70, 80, 90, 60, 0, 16);


    }


    public void PlayNow(View view) {
        Intent myIntent = new Intent(this,PlayNowActivity.class);
        startActivity(myIntent);
    }

    public void Tournament(View view) {
        Intent myIntent = new Intent(this,TournamentActivity.class);
        startActivity(myIntent);
    }

    public void Season(View view) {
        Intent myIntent = new Intent(this,SeasonActivity.class);
        startActivity(myIntent);
    }

    public void Bluetooth(View view) {
        Intent myIntent = new Intent(this,PvP_BluetoothActivity.class);
        startActivity(myIntent);
    }

    public void Practice(View view) {
        Intent myIntent = new Intent(this,PracticeActivity.class);
        startActivity(myIntent);
    }
}
