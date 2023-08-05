<?php
$menu = array('name' => 'GULAI', 'price' => 9);
echo 'Nilai $menu: ';
// var_export adalah function untuk melihat isi variable
var_export($menu);
echo '<br>';
echo '-----';
echo '<br>';

// Ketik code Anda dibawah
// Ambil nilai 'name' dan 'price' dari array $menu
$menuName = $menu['name'];
$menuPrice = $menu['price'];

// Cetak nilai 'name' dan 'price'
echo $menuName . " berharga $" . $menuPrice;
?>
