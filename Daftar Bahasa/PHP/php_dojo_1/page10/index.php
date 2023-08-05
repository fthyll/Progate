<?php
$menus = array(
  array('name' => 'GULAI', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'KOPI', 'price' => 6)
);

// Menghitung harga total dari semua menu
$totalPrice = 0;

foreach ($menus as $menu) {
    $menuName = $menu['name'];
    $menuPrice = $menu['price'];
    echo $menuName . " berharga $" . $menuPrice . "<br>";
    $totalPrice += $menuPrice;
}

// Cetak harga total
echo 'Harga total adalah $' . $totalPrice;
?>
