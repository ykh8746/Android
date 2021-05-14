package org.techtown.doitmission09

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [clientinfor.newInstance] factory method to
 * create an instance of this fragment.
 */
class clientinfor : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val fragment = inflater.inflate(R.layout.fragment_clientinfor, container, false)

        val currentDate = Calendar.getInstance().time
        var dateFormat = SimpleDateFormat("yyyy.MM.dd", Locale.KOREA).format(currentDate)
        var dateButton : Button = fragment.findViewById(R.id.button)
        var saveButton : Button = fragment.findViewById(R.id.button2)

        dateButton.setText("$dateFormat")

        dateButton.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)


            val dpd = DatePickerDialog(requireContext(), DatePickerDialog.OnDateSetListener{view, mYear, mMonth, mDay ->
                dateButton.setText("$mYear. ${mMonth+1}. $mDay")
            }, year, month, day)

            dpd.show()
        }

        saveButton.setOnClickListener {
            val birStr : String = dateButton.text.toString()

            Toast.makeText(requireContext(), "생년월일 : $birStr" ,Toast.LENGTH_LONG).show()
        }



        return fragment
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment clientinfor.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            clientinfor().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}