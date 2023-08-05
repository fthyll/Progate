<?php
function fizzBuzz($n) {
    for ($i = 1; $i <= $n; $i++) {
        $output = "";

        if ($i % 3 === 0) {
            $output .= "Fizz";
        }

        if ($i % 5 === 0) {
            $output .= "Buzz";
        }

        echo $output !== "" ? $output : $i;
        echo '<br>';
    }
}

// Test the function with N = 100
fizzBuzz(100);
?>
