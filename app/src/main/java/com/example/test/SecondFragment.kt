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
            binding.textView2.visibility = View.VISIBLE
            binding.textView4.visibility = View.VISIBLE
            binding.textView3.visibility = View.VISIBLE
            binding.imageView.visibility = View.VISIBLE

            var username = binding.inputName.text

            var medical = "BBS Medical"

            var doctorsNote = "To whom it may concern,\n" +
                    "\n" +
                    "Please excuse " + username + " from work today. It appears that " + username +
                    " has symptoms of a viral disease that would be a danger to their coworkers as well as a hazard to their own health. " +
                    "It is my professional opinion that" + username +
                    " should stay home and relax in order to return to full function. " +
                    "I will notify you if their test results come back positive and they require more time off of work to recover. \n"

            var doctor = "Dr Benjamin Smith"

            binding.textView2.text = doctorsNote
            binding.textView4.text = medical
            binding.textView3.text = doctor




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