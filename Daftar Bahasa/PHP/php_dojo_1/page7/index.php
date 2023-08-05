<?php
$prices = array(10, 6, 7, 8);

// Menampilkan nilai $prices
echo 'Nilai $prices: ';
foreach ($prices as $price) {
    echo $price.' ';
}
echo '<br>';
echo '-----';
echo '<br>';

// Pencarian manual harga termahal melalui loop
$maxPrice = 0; // Menyimpan harga termahal, diinisialisasi dengan nilai awal 0

foreach ($prices as $price) {
    if ($price > $maxPrice) {
        $maxPrice = $price;
    }
}

echo 'Harga termahal adalah $' . $maxPrice;
?>
