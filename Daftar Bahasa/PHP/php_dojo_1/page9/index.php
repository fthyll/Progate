<?php
$menus = array(
  array('name' => 'GULAI', 'price' => 9),
  array('name' => 'PASTA', 'price' => 12),
  array('name' => 'KOPI', 'price' => 6)
);

// Ketik code Anda dibawah
foreach ($menus as $menu) {
    $menuName = $menu['name'];
    $menuPrice = $menu['price'];
    echo $menuName . " berharga $" . $menuPrice . "<br>";
}
?>
