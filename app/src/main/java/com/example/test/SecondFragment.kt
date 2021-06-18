package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.test.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

private var _binding: FragmentSecondBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      _binding = FragmentSecondBinding.inflate(inflater, container, false)
      return binding.root

    }

    /** Called when the user touches the button */
    fun newNote(view: View) {
        val textView2 = view.findViewById<TextView>(R.id.textView2)

        val button = view.findViewById<TextView>(R.id.button2)
        button.setOnClickListener {
            textView2.visibility = View.VISIBLE;
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonSecond = view.findViewById<TextView>(R.id.button_third)

        binding.buttonThird.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}



/** Called when the user touches the button */
fun newNote(view: View) {

}