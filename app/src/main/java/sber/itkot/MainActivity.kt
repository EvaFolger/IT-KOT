package sber.itkot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var yourText: EditText
    lateinit var sendButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yourText = textV
        sendButton=butt2


        sendButton.setOnClickListener {
           // searchWeb(yourText.text.toString())
            isRKNForbadeIt(searchWeb(yourText.text.toString()))
        }
    }
    fun isRKNForbadeIt(url:String){
        if (url in arrayOfBan){
            Toast.makeText(this, "$url был запрещён РКН", Toast.LENGTH_LONG).show()
        }
        else if(url ==""){
            Toast.makeText(this, "ccылки не обнаружено", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, "$url является разрешённым ресурсом", Toast.LENGTH_LONG).show()
        }

    }

    fun searchWeb(ourText: String):String {
        var ourChars=ourText.toCharArray()
        ourChars=ourChars.plus(" ".toCharArray())
        var i=0
        var ourUrl =""
        while(i < ourChars.size-1){
        if(ourChars[i].toString()=="w"&&ourChars[i+1].toString()=="w"&&ourChars[i+2].toString()=="w"){
            while(ourChars[i].toString()!=" "&&i!=ourChars.size){
                ourUrl=ourUrl+ourChars[i]
                i++
            }
            }else if(ourChars[i].toString()=="h"&&ourChars[i+1].toString()=="t"&&ourChars[i+2].toString()=="t"&&ourChars[i+3].toString()=="p"){
            while(ourChars[i].toString()!=" "&&i!=ourChars.size){
                ourUrl=ourUrl+ourChars[i]
                i++
                    }
                }else{
                    i++ }
        }
        Toast.makeText(this, ourUrl, Toast.LENGTH_LONG).show()
        return ourUrl
        }}


