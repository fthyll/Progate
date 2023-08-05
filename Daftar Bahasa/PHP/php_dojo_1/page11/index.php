<?php
$menus = array(
  array('name' => 'GULAI', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'KOPI', 'price' => 6)
);

// Menghitung harga total dari semua menu
$totalPrice = 0;
$maxPrice = 0;
$maxPriceItem = '';

foreach ($menus as $menu) {
    $menuName = $menu['name'];
    $menuPrice = $menu['price'];
    echo $menuName . " berharga $" . $menuPrice . "<br>";
    $totalPrice += $menuPrice;

    // Mencari harga termahal
    if ($menuPrice > $maxPrice) {
        $maxPrice = $menuPrice;
        $maxPriceItem = $menuName;
    }
}

// Cetak harga total
echo 'Harga total adalah $' . $totalPrice . '<br>';
// Cetak harga item termahal
echo 'Harga item termahal adalah ' . $maxPriceItem . ' dengan harga $' . $maxPrice;
?>
