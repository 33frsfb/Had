import 'dart:math';

import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(home: Scaffold(
    appBar: AppBar(title: Text("this is dicepage"),centerTitle: true,),
    body: Dicepage(),
  ),
  )
  );
}

class Dicepage extends StatefulWidget {
  @override
  const Dicepage({Key?key}) : super(key: key);



    _DicePageState createState()=> _DicePageState();

}

class _DicePageState extends State<Dicepage> {
  @override

  int left=1;
  int right=2;

  void changeFace(){

    setState(() {

      left=Random().nextInt(6)+1;
      right=Random().nextInt(6)+1;

    });

  }

  Widget build(BuildContext context) {
    // TODO: implement build

    return Center(
      child: Container(
        child: Row(
          children: [
            Expanded(
              flex:1,
              child: TextButton(
                style: TextButton.styleFrom(backgroundColor:Colors.yellowAccent), onPressed: () { changeFace(); },
                child: Image.asset("images/dice$left.png"),
              ),
            ),

            Expanded(
              flex: 1,
              child: TextButton(
                style:TextButton.styleFrom(backgroundColor: Colors.orange),
                onPressed: () { changeFace(); }, child:Image.asset("images/dice$right.png"),

              )
            )
          ],
        ),
      ),

    );
    throw UnimplementedError();
  }
}

