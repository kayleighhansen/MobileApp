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
        binding.button2.setOnClickListener {
            newNote()
        }
      return binding.root

    }

    /** Called when the user touches the button */
     private fun newNote() {
        binding.button2.setOnClickListener {
            binding.textView2.visibility = View.VISIBLE;
            binding.textView4.visibility = View.VISIBLE;
            binding.textView3.visibility = View.VISIBLE;
            binding.imageView.visibility = View.VISIBLE;

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