package org.techtown.plusquickprice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.TextView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById(R.id.textView)
        val startSpi : Spinner = findViewById(R.id.spinner)
        val arriveSpi : Spinner = findViewById(R.id.spinner2)
        val startArr : Array<String> = resources.getStringArray(R.array.출발지)
        val arriveArr : Array<String> = resources.getStringArray(R.array.도착지)



        startSpi.setSelection(0)
        arriveSpi.setSelection(0)

        initspinner(startSpi, startSpi, arriveSpi, startArr, arriveArr, textView)
        initspinner(arriveSpi, startSpi, arriveSpi, startArr, arriveArr, textView)


    }

    private fun initspinner(spinner: Spinner, startSpi: Spinner, arriveSpi: Spinner, startArr: Array<String>,arriveArr: Array<String>, textView: TextView) {



        spinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener{
                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                    compareposition(startSpi, arriveSpi, startArr, arriveArr, textView)

                }
            }
    }

    fun compareposition(startSpi: Spinner, arriveSpi: Spinner, startArr: Array<String>, arriveArr: Array<String>, textView: TextView){

        val startposition : Any = startSpi.selectedItem
        val arriveposition : Any = arriveSpi.selectedItem

        when{
            //옥출
            startposition == startArr[0] && arriveposition == arriveArr[0] -> textView.setText("3,000원")
            startposition == startArr[0] && arriveposition == arriveArr[1] -> textView.setText("3,000원")
            startposition == startArr[0] && arriveposition == arriveArr[2] -> textView.setText("3,000원")
            startposition == startArr[0] && arriveposition == arriveArr[3] -> textView.setText("4,000원")
            startposition == startArr[0] && arriveposition == arriveArr[4] -> textView.setText("4,000원")
            startposition == startArr[0] && arriveposition == arriveArr[5] -> textView.setText("6,000원\n논공 7,000원\n5공단 8,000원")
            startposition == startArr[0] && arriveposition == arriveArr[6] -> textView.setText("6,000원\n에코랜드 7,000원")
            startposition == startArr[0] && arriveposition == arriveArr[7] -> textView.setText("3,000원\n후문지나 4,000원")
            startposition == startArr[0] && arriveposition == arriveArr[8] -> textView.setText("3,000원")
            startposition == startArr[0] && arriveposition == arriveArr[9] -> textView.setText("마을 5,000원\n전원 6,000원")
            startposition == startArr[0] && arriveposition == arriveArr[10] -> textView.setText("4,000원")
            startposition == startArr[0] && arriveposition == arriveArr[11] -> textView.setText("5,000원")
            startposition == startArr[0] && arriveposition == arriveArr[12] -> textView.setText("4,000원")
            startposition == startArr[0] && arriveposition == arriveArr[13] -> textView.setText("5,000원부터")
            startposition == startArr[0] && arriveposition == arriveArr[14] -> textView.setText("4,000원\n마을안 5,000원")

            startposition == startArr[0] && arriveposition == arriveArr[15] -> textView.setText("5,000원부터")
            startposition == startArr[0] && arriveposition == arriveArr[16] -> textView.setText("6,000원")
            startposition == startArr[0] && arriveposition == arriveArr[17] -> textView.setText("7,000원")
            startposition == startArr[0] && arriveposition == arriveArr[18] -> textView.setText("8,000원")
            startposition == startArr[0] && arriveposition == arriveArr[19] -> textView.setText("9,000원")
            startposition == startArr[0] && arriveposition == arriveArr[20] -> textView.setText("7,000원")
            startposition == startArr[0] && arriveposition == arriveArr[21] -> textView.setText("8,000원")
            startposition == startArr[0] && arriveposition == arriveArr[22] -> textView.setText("9,000원")
            startposition == startArr[0] && arriveposition == arriveArr[23] -> textView.setText("10,000원")
            startposition == startArr[0] && arriveposition == arriveArr[24] -> textView.setText("12,000원")
            startposition == startArr[0] && arriveposition == arriveArr[25] -> textView.setText("13,000원")
            startposition == startArr[0] && arriveposition == arriveArr[26] -> textView.setText("8,000원부터")
            startposition == startArr[0] && arriveposition == arriveArr[27] -> textView.setText("8,000원부터")
            startposition == startArr[0] && arriveposition == arriveArr[28] -> textView.setText("6,000원")
            startposition == startArr[0] && arriveposition == arriveArr[29] -> textView.setText("7,000원")

            startposition == startArr[0] && arriveposition == arriveArr[30] -> textView.setText("8,000원")
            startposition == startArr[0] && arriveposition == arriveArr[31] -> textView.setText("7,000원")
            startposition == startArr[0] && arriveposition == arriveArr[32] -> textView.setText("9,000원")
            startposition == startArr[0] && arriveposition == arriveArr[33] -> textView.setText("8,000원")
            startposition == startArr[0] && arriveposition == arriveArr[34] -> textView.setText("9,000원")
            startposition == startArr[0] && arriveposition == arriveArr[35] -> textView.setText("10,000원")
            startposition == startArr[0] && arriveposition == arriveArr[36] -> textView.setText("9,000원")
            startposition == startArr[0] && arriveposition == arriveArr[37] -> textView.setText("10,000원")
            startposition == startArr[0] && arriveposition == arriveArr[38] -> textView.setText("12,000원")
            startposition == startArr[0] && arriveposition == arriveArr[39] -> textView.setText("12,000원")
            startposition == startArr[0] && arriveposition == arriveArr[40] -> textView.setText("9,000원")
            startposition == startArr[0] && arriveposition == arriveArr[41] -> textView.setText("10,000원")
            startposition == startArr[0] && arriveposition == arriveArr[42] -> textView.setText("10,000원")
            startposition == startArr[0] && arriveposition == arriveArr[43] -> textView.setText("25,000원부터")
            startposition == startArr[0] && arriveposition == arriveArr[44] -> textView.setText("12,000원")

            //확출
            startposition == startArr[1] && arriveposition == arriveArr[0] -> textView.setText("4,000원")
            startposition == startArr[1] && arriveposition == arriveArr[1] -> textView.setText("3,000원")
            startposition == startArr[1] && arriveposition == arriveArr[2] -> textView.setText("4,000원")
            startposition == startArr[1] && arriveposition == arriveArr[3] -> textView.setText("산동 3,000원\n봉산5,000원")
            startposition == startArr[1] && arriveposition == arriveArr[4] -> textView.setText("3,000원")
            startposition == startArr[1] && arriveposition == arriveArr[5] -> textView.setText("4,000원\n논공 5,000원\n5공단 6,000원")
            startposition == startArr[1] && arriveposition == arriveArr[6] -> textView.setText("5,000원\n에코랜드 6,000원")
            startposition == startArr[1] && arriveposition == arriveArr[7] -> textView.setText("5,000원\n후문지나 6,000원")
            startposition == startArr[1] && arriveposition == arriveArr[8] -> textView.setText("5,000원")
            startposition == startArr[1] && arriveposition == arriveArr[9] -> textView.setText("마을 6,000원\n전원 7,000원")
            startposition == startArr[1] && arriveposition == arriveArr[10] -> textView.setText("5,000원")
            startposition == startArr[1] && arriveposition == arriveArr[11] -> textView.setText("6,000원")
            startposition == startArr[1] && arriveposition == arriveArr[12] -> textView.setText("5,000원")
            startposition == startArr[1] && arriveposition == arriveArr[13] -> textView.setText("6,000원부터")
            startposition == startArr[1] && arriveposition == arriveArr[14] -> textView.setText("5,000원\n마을안 5,000원")

            startposition == startArr[1] && arriveposition == arriveArr[15] -> textView.setText("5,000원부터")
            startposition == startArr[1] && arriveposition == arriveArr[16] -> textView.setText("8,000원")
            startposition == startArr[1] && arriveposition == arriveArr[17] -> textView.setText("9,000원")
            startposition == startArr[1] && arriveposition == arriveArr[18] -> textView.setText("10,000원")
            startposition == startArr[1] && arriveposition == arriveArr[19] -> textView.setText("11,000원")
            startposition == startArr[1] && arriveposition == arriveArr[20] -> textView.setText("9,000원")
            startposition == startArr[1] && arriveposition == arriveArr[21] -> textView.setText("10,000원")
            startposition == startArr[1] && arriveposition == arriveArr[22] -> textView.setText("11,000원")
            startposition == startArr[1] && arriveposition == arriveArr[23] -> textView.setText("13,000원")
            startposition == startArr[1] && arriveposition == arriveArr[24] -> textView.setText("14,000원")
            startposition == startArr[1] && arriveposition == arriveArr[25] -> textView.setText("15,000원")
            startposition == startArr[1] && arriveposition == arriveArr[26] -> textView.setText("7,000원부터")
            startposition == startArr[1] && arriveposition == arriveArr[27] -> textView.setText("8,000원부터")
            startposition == startArr[1] && arriveposition == arriveArr[28] -> textView.setText("8,000원")
            startposition == startArr[1] && arriveposition == arriveArr[29] -> textView.setText("9,000원")

            startposition == startArr[1] && arriveposition == arriveArr[30] -> textView.setText("10,000원")
            startposition == startArr[1] && arriveposition == arriveArr[31] -> textView.setText("9,000원")
            startposition == startArr[1] && arriveposition == arriveArr[32] -> textView.setText("11,000원")
            startposition == startArr[1] && arriveposition == arriveArr[33] -> textView.setText("10,000원")
            startposition == startArr[1] && arriveposition == arriveArr[34] -> textView.setText("11,000원")
            startposition == startArr[1] && arriveposition == arriveArr[35] -> textView.setText("12,000원")
            startposition == startArr[1] && arriveposition == arriveArr[36] -> textView.setText("11,000원")
            startposition == startArr[1] && arriveposition == arriveArr[37] -> textView.setText("12,000원")
            startposition == startArr[1] && arriveposition == arriveArr[38] -> textView.setText("14,000원")
            startposition == startArr[1] && arriveposition == arriveArr[39] -> textView.setText("14,000원")
            startposition == startArr[1] && arriveposition == arriveArr[40] -> textView.setText("11,000원")
            startposition == startArr[1] && arriveposition == arriveArr[41] -> textView.setText("12,000원")
            startposition == startArr[1] && arriveposition == arriveArr[42] -> textView.setText("12,000원")
            startposition == startArr[1] && arriveposition == arriveArr[43] -> textView.setText("24,000원부터")
            startposition == startArr[1] && arriveposition == arriveArr[44] -> textView.setText("11,000원")

            //산동면(상)
            startposition == startArr[2] && arriveposition == arriveArr[0] -> textView.setText("6,000원")
            startposition == startArr[2] && arriveposition == arriveArr[1] -> textView.setText("5,000원")
            startposition == startArr[2] && arriveposition == arriveArr[2] -> textView.setText("6,000원")
            startposition == startArr[2] && arriveposition == arriveArr[3] -> textView.setText("산동 4,000원\n봉산 6,000원")
            startposition == startArr[2] && arriveposition == arriveArr[4] -> textView.setText("4,000원")
            startposition == startArr[2] && arriveposition == arriveArr[5] -> textView.setText("4,000원\n논공 4,000원\n5공단 5,000원")
            startposition == startArr[2] && arriveposition == arriveArr[6] -> textView.setText("5,000원\n에코랜드 6,000원")
            startposition == startArr[2] && arriveposition == arriveArr[7] -> textView.setText("6,000원\n후문지나 7,000원")
            startposition == startArr[2] && arriveposition == arriveArr[8] -> textView.setText("6,000원")
            startposition == startArr[2] && arriveposition == arriveArr[9] -> textView.setText("마을 7,000원\n전원 8,000원")
            startposition == startArr[2] && arriveposition == arriveArr[10] -> textView.setText("6,000원")
            startposition == startArr[2] && arriveposition == arriveArr[11] -> textView.setText("7,000원")
            startposition == startArr[2] && arriveposition == arriveArr[12] -> textView.setText("7,000원")
            startposition == startArr[2] && arriveposition == arriveArr[13] -> textView.setText("8,000원부터")
            startposition == startArr[2] && arriveposition == arriveArr[14] -> textView.setText("5,000원\n마을안 5,000원")

            startposition == startArr[2] && arriveposition == arriveArr[15] -> textView.setText("5,000원부터")
            startposition == startArr[2] && arriveposition == arriveArr[16] -> textView.setText("9,000원")
            startposition == startArr[2] && arriveposition == arriveArr[17] -> textView.setText("10,000원")
            startposition == startArr[2] && arriveposition == arriveArr[18] -> textView.setText("11,000원")
            startposition == startArr[2] && arriveposition == arriveArr[19] -> textView.setText("12,000원")
            startposition == startArr[2] && arriveposition == arriveArr[20] -> textView.setText("10,000원")
            startposition == startArr[2] && arriveposition == arriveArr[21] -> textView.setText("11,000원")
            startposition == startArr[2] && arriveposition == arriveArr[22] -> textView.setText("12,000원")
            startposition == startArr[2] && arriveposition == arriveArr[23] -> textView.setText("14,000원")
            startposition == startArr[2] && arriveposition == arriveArr[24] -> textView.setText("15,000원")
            startposition == startArr[2] && arriveposition == arriveArr[25] -> textView.setText("16,000원")
            startposition == startArr[2] && arriveposition == arriveArr[26] -> textView.setText("7,000원부터")
            startposition == startArr[2] && arriveposition == arriveArr[27] -> textView.setText("8,000원부터")
            startposition == startArr[2] && arriveposition == arriveArr[28] -> textView.setText("9,000원")
            startposition == startArr[2] && arriveposition == arriveArr[29] -> textView.setText("10,000원")

            startposition == startArr[2] && arriveposition == arriveArr[30] -> textView.setText("11,000원")
            startposition == startArr[2] && arriveposition == arriveArr[31] -> textView.setText("10,000원")
            startposition == startArr[2] && arriveposition == arriveArr[32] -> textView.setText("12,000원")
            startposition == startArr[2] && arriveposition == arriveArr[33] -> textView.setText("11,000원")
            startposition == startArr[2] && arriveposition == arriveArr[34] -> textView.setText("12,000원")
            startposition == startArr[2] && arriveposition == arriveArr[35] -> textView.setText("13,000원")
            startposition == startArr[2] && arriveposition == arriveArr[36] -> textView.setText("12,000원")
            startposition == startArr[2] && arriveposition == arriveArr[37] -> textView.setText("13,000원")
            startposition == startArr[2] && arriveposition == arriveArr[38] -> textView.setText("15,000원")
            startposition == startArr[2] && arriveposition == arriveArr[39] -> textView.setText("15,000원")
            startposition == startArr[2] && arriveposition == arriveArr[40] -> textView.setText("12,000원")
            startposition == startArr[2] && arriveposition == arriveArr[41] -> textView.setText("13,000원")
            startposition == startArr[2] && arriveposition == arriveArr[42] -> textView.setText("13,000원")
            startposition == startArr[2] && arriveposition == arriveArr[43] -> textView.setText("24,000원부터")
            startposition == startArr[2] && arriveposition == arriveArr[44] -> textView.setText("11,000원")


            //구포출
            startposition == startArr[3] && arriveposition == arriveArr[0] -> textView.setText("3,000원")
            startposition == startArr[3] && arriveposition == arriveArr[1] -> textView.setText("3,000원")
            startposition == startArr[3] && arriveposition == arriveArr[2] -> textView.setText("3,000원")
            startposition == startArr[3] && arriveposition == arriveArr[3] -> textView.setText("4,000원")
            startposition == startArr[3] && arriveposition == arriveArr[4] -> textView.setText("5,000원")
            startposition == startArr[3] && arriveposition == arriveArr[5] -> textView.setText("7,000원\n논공 8,000원\n5공단 9,000원")
            startposition == startArr[3] && arriveposition == arriveArr[6] -> textView.setText("7,000원\n에코랜드 8,000원")
            startposition == startArr[3] && arriveposition == arriveArr[7] -> textView.setText("3,000원\n후문지나 4,000원")
            startposition == startArr[3] && arriveposition == arriveArr[8] -> textView.setText("3,000원")
            startposition == startArr[3] && arriveposition == arriveArr[9] -> textView.setText("마을 5,000원\n전원 6,000원")
            startposition == startArr[3] && arriveposition == arriveArr[10] -> textView.setText("4,000원")
            startposition == startArr[3] && arriveposition == arriveArr[11] -> textView.setText("5,000원")
            startposition == startArr[3] && arriveposition == arriveArr[12] -> textView.setText("5,000원")
            startposition == startArr[3] && arriveposition == arriveArr[13] -> textView.setText("6,000원부터")
            startposition == startArr[3] && arriveposition == arriveArr[14] -> textView.setText("6,000원\n마을안 7,000원")

            startposition == startArr[3] && arriveposition == arriveArr[15] -> textView.setText("6,000원부터")
            startposition == startArr[3] && arriveposition == arriveArr[16] -> textView.setText("6,000원")
            startposition == startArr[3] && arriveposition == arriveArr[17] -> textView.setText("7,000원")
            startposition == startArr[3] && arriveposition == arriveArr[18] -> textView.setText("8,000원")
            startposition == startArr[3] && arriveposition == arriveArr[19] -> textView.setText("9,000원")
            startposition == startArr[3] && arriveposition == arriveArr[20] -> textView.setText("7,000원")
            startposition == startArr[3] && arriveposition == arriveArr[21] -> textView.setText("8,000원")
            startposition == startArr[3] && arriveposition == arriveArr[22] -> textView.setText("9,000원")
            startposition == startArr[3] && arriveposition == arriveArr[23] -> textView.setText("10,000원")
            startposition == startArr[3] && arriveposition == arriveArr[24] -> textView.setText("12,000원")
            startposition == startArr[3] && arriveposition == arriveArr[25] -> textView.setText("13,000원")
            startposition == startArr[3] && arriveposition == arriveArr[26] -> textView.setText("10,000원부터")
            startposition == startArr[3] && arriveposition == arriveArr[27] -> textView.setText("9,000원부터")
            startposition == startArr[3] && arriveposition == arriveArr[28] -> textView.setText("6,000원")
            startposition == startArr[3] && arriveposition == arriveArr[29] -> textView.setText("7,000원")

            startposition == startArr[3] && arriveposition == arriveArr[30] -> textView.setText("8,000원")
            startposition == startArr[3] && arriveposition == arriveArr[31] -> textView.setText("7,000원")
            startposition == startArr[3] && arriveposition == arriveArr[32] -> textView.setText("9,000원")
            startposition == startArr[3] && arriveposition == arriveArr[33] -> textView.setText("8,000원")
            startposition == startArr[3] && arriveposition == arriveArr[34] -> textView.setText("9,000원")
            startposition == startArr[3] && arriveposition == arriveArr[35] -> textView.setText("10,000원")
            startposition == startArr[3] && arriveposition == arriveArr[36] -> textView.setText("9,000원")
            startposition == startArr[3] && arriveposition == arriveArr[37] -> textView.setText("10,000원")
            startposition == startArr[3] && arriveposition == arriveArr[38] -> textView.setText("12,000원")
            startposition == startArr[3] && arriveposition == arriveArr[39] -> textView.setText("12,000원")
            startposition == startArr[3] && arriveposition == arriveArr[40] -> textView.setText("9,000원")
            startposition == startArr[3] && arriveposition == arriveArr[41] -> textView.setText("10,000원")
            startposition == startArr[3] && arriveposition == arriveArr[42] -> textView.setText("10,000원")
            startposition == startArr[3] && arriveposition == arriveArr[43] -> textView.setText("25,000원부터")
            startposition == startArr[3] && arriveposition == arriveArr[44] -> textView.setText("12,000원")

            //거의동 출
            startposition == startArr[4] && arriveposition == arriveArr[0] -> textView.setText("4,000원")
            startposition == startArr[4] && arriveposition == arriveArr[1] -> textView.setText("5,000원")
            startposition == startArr[4] && arriveposition == arriveArr[2] -> textView.setText("5,000원")
            startposition == startArr[4] && arriveposition == arriveArr[3] -> textView.setText("5,000원")
            startposition == startArr[4] && arriveposition == arriveArr[4] -> textView.setText("5,000원")
            startposition == startArr[4] && arriveposition == arriveArr[5] -> textView.setText("7,000원\n논공 8,000원\n5공단 9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[6] -> textView.setText("8,000원\n에코랜드 9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[7] -> textView.setText("4,000원\n후문지나 5,000원")
            startposition == startArr[4] && arriveposition == arriveArr[8] -> textView.setText("3,000원")
            startposition == startArr[4] && arriveposition == arriveArr[9] -> textView.setText("마을 5,000원\n전원 6,000원")
            startposition == startArr[4] && arriveposition == arriveArr[10] -> textView.setText("5,000원")
            startposition == startArr[4] && arriveposition == arriveArr[11] -> textView.setText("6,000원")
            startposition == startArr[4] && arriveposition == arriveArr[12] -> textView.setText("6,000원")
            startposition == startArr[4] && arriveposition == arriveArr[13] -> textView.setText("7,000원부터")
            startposition == startArr[4] && arriveposition == arriveArr[14] -> textView.setText("6,000원\n마을안 7,000원")

            startposition == startArr[4] && arriveposition == arriveArr[15] -> textView.setText("6,000원부터")
            startposition == startArr[4] && arriveposition == arriveArr[16] -> textView.setText("7,000원")
            startposition == startArr[4] && arriveposition == arriveArr[17] -> textView.setText("8,000원")
            startposition == startArr[4] && arriveposition == arriveArr[18] -> textView.setText("9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[19] -> textView.setText("10,000원")
            startposition == startArr[4] && arriveposition == arriveArr[20] -> textView.setText("8,000원")
            startposition == startArr[4] && arriveposition == arriveArr[21] -> textView.setText("9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[22] -> textView.setText("10,000원")
            startposition == startArr[4] && arriveposition == arriveArr[23] -> textView.setText("11,000원")
            startposition == startArr[4] && arriveposition == arriveArr[24] -> textView.setText("13,000원")
            startposition == startArr[4] && arriveposition == arriveArr[25] -> textView.setText("14,000원")
            startposition == startArr[4] && arriveposition == arriveArr[26] -> textView.setText("10,000원부터")
            startposition == startArr[4] && arriveposition == arriveArr[27] -> textView.setText("10,000원부터")
            startposition == startArr[4] && arriveposition == arriveArr[28] -> textView.setText("6,000원")
            startposition == startArr[4] && arriveposition == arriveArr[29] -> textView.setText("7,000원")

            startposition == startArr[4] && arriveposition == arriveArr[30] -> textView.setText("8,000원")
            startposition == startArr[4] && arriveposition == arriveArr[31] -> textView.setText("7,000원")
            startposition == startArr[4] && arriveposition == arriveArr[32] -> textView.setText("9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[33] -> textView.setText("8,000원")
            startposition == startArr[4] && arriveposition == arriveArr[34] -> textView.setText("9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[35] -> textView.setText("10,000원")
            startposition == startArr[4] && arriveposition == arriveArr[36] -> textView.setText("9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[37] -> textView.setText("10,000원")
            startposition == startArr[4] && arriveposition == arriveArr[38] -> textView.setText("12,000원")
            startposition == startArr[4] && arriveposition == arriveArr[39] -> textView.setText("12,000원")
            startposition == startArr[4] && arriveposition == arriveArr[40] -> textView.setText("9,000원")
            startposition == startArr[4] && arriveposition == arriveArr[41] -> textView.setText("10,000원")
            startposition == startArr[4] && arriveposition == arriveArr[42] -> textView.setText("10,000원")
            startposition == startArr[4] && arriveposition == arriveArr[43] -> textView.setText("25,000원부터")
            startposition == startArr[4] && arriveposition == arriveArr[44] -> textView.setText("13,000원")

            //봉산리 출
            startposition == startArr[5] && arriveposition == arriveArr[0] -> textView.setText("4,000원")
            startposition == startArr[5] && arriveposition == arriveArr[1] -> textView.setText("4,000원")
            startposition == startArr[5] && arriveposition == arriveArr[2] -> textView.setText("4,000원")
            startposition == startArr[5] && arriveposition == arriveArr[3] -> textView.setText("산동 5,000원\n봉산 4,000원")
            startposition == startArr[5] && arriveposition == arriveArr[4] -> textView.setText("5,000원")
            startposition == startArr[5] && arriveposition == arriveArr[5] -> textView.setText("7,000원\n논공 8,000원\n5공단 9,000원")
            startposition == startArr[5] && arriveposition == arriveArr[6] -> textView.setText("7,000원\n에코랜드 8,000원")
            startposition == startArr[5] && arriveposition == arriveArr[7] -> textView.setText("3,000원\n후문지나 4,000원")
            startposition == startArr[5] && arriveposition == arriveArr[8] -> textView.setText("5,000원")
            startposition == startArr[5] && arriveposition == arriveArr[9] -> textView.setText("마을 6,000원\n전원 7,000원")
            startposition == startArr[5] && arriveposition == arriveArr[10] -> textView.setText("4,000원")
            startposition == startArr[5] && arriveposition == arriveArr[11] -> textView.setText("5,000원")
            startposition == startArr[5] && arriveposition == arriveArr[12] -> textView.setText("5,000원")
            startposition == startArr[5] && arriveposition == arriveArr[13] -> textView.setText("6,000원부터")
            startposition == startArr[5] && arriveposition == arriveArr[14] -> textView.setText("6,000원\n마을안 7,000원")

            startposition == startArr[5] && arriveposition == arriveArr[15] -> textView.setText("6,000원부터")
            startposition == startArr[5] && arriveposition == arriveArr[16] -> textView.setText("7,000원")
            startposition == startArr[5] && arriveposition == arriveArr[17] -> textView.setText("8,000원")
            startposition == startArr[5] && arriveposition == arriveArr[18] -> textView.setText("9,000원")
            startposition == startArr[5] && arriveposition == arriveArr[19] -> textView.setText("10,000원")
            startposition == startArr[5] && arriveposition == arriveArr[20] -> textView.setText("8,000원")
            startposition == startArr[5] && arriveposition == arriveArr[21] -> textView.setText("9,000원")
            startposition == startArr[5] && arriveposition == arriveArr[22] -> textView.setText("10,000원")
            startposition == startArr[5] && arriveposition == arriveArr[23] -> textView.setText("11,000원")
            startposition == startArr[5] && arriveposition == arriveArr[24] -> textView.setText("13,000원")
            startposition == startArr[5] && arriveposition == arriveArr[25] -> textView.setText("14,000원")
            startposition == startArr[5] && arriveposition == arriveArr[26] -> textView.setText("10,000원부터")
            startposition == startArr[5] && arriveposition == arriveArr[27] -> textView.setText("9,000원부터")
            startposition == startArr[5] && arriveposition == arriveArr[28] -> textView.setText("7,000원")
            startposition == startArr[5] && arriveposition == arriveArr[29] -> textView.setText("8,000원")

            startposition == startArr[5] && arriveposition == arriveArr[30] -> textView.setText("9,000원")
            startposition == startArr[5] && arriveposition == arriveArr[31] -> textView.setText("8,000원")
            startposition == startArr[5] && arriveposition == arriveArr[32] -> textView.setText("10,000원")
            startposition == startArr[5] && arriveposition == arriveArr[33] -> textView.setText("9,000원")
            startposition == startArr[5] && arriveposition == arriveArr[34] -> textView.setText("10,000원")
            startposition == startArr[5] && arriveposition == arriveArr[35] -> textView.setText("11,000원")
            startposition == startArr[5] && arriveposition == arriveArr[36] -> textView.setText("10,000원")
            startposition == startArr[5] && arriveposition == arriveArr[37] -> textView.setText("11,000원")
            startposition == startArr[5] && arriveposition == arriveArr[38] -> textView.setText("13,000원")
            startposition == startArr[5] && arriveposition == arriveArr[39] -> textView.setText("13,000원")
            startposition == startArr[5] && arriveposition == arriveArr[40] -> textView.setText("10,000원")
            startposition == startArr[5] && arriveposition == arriveArr[41] -> textView.setText("11,000원")
            startposition == startArr[5] && arriveposition == arriveArr[42] -> textView.setText("11,000원")
            startposition == startArr[5] && arriveposition == arriveArr[43] -> textView.setText("26,000원부터")
            startposition == startArr[5] && arriveposition == arriveArr[44] -> textView.setText("12,000원")

        }
    }
}

