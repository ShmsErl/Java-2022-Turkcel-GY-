using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Collections.Specialized;
using System.Configuration;

namespace Otomasyon
{
    public partial class Form3 : Form
    {
        SqlConnection baglanti;
        public Form3()
        {
            InitializeComponent();
            baglanti = new SqlConnection("Data Source=DESKTOP-J6VV81B\\SEHMUS;Initial Catalog=otomasyon3;Integrated Security=True");
            otobus_getir();
        }

        private void otobus_getir()
        {
            baglanti.Open();
            string sql = "select * from Otobusler";
            SqlCommand komut = new SqlCommand(sql, baglanti);
            SqlDataAdapter da = new SqlDataAdapter(komut);
            DataTable dt = new DataTable();
            da.Fill(dt);
            dgvOtobusler.DataSource = dt;
            baglanti.Close();
        }

        private void dgvOtobusler_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            decimal ID = Convert.ToInt32(dgvOtobusler.Rows[e.RowIndex].Cells[0].Value.ToString());
            tbOtobusID.Text = ID + "";
            tbOtobusAdi.Text = dgvOtobusler.Rows[e.RowIndex].Cells[1].Value.ToString();
            tbKoltukAdedi.Text = dgvOtobusler.Rows[e.RowIndex].Cells[2].Value.ToString();
            tbKoltukDuzeni.Text = dgvOtobusler.Rows[e.RowIndex].Cells[3].Value.ToString();
            tbBagajHacmi.Text = dgvOtobusler.Rows[e.RowIndex].Cells[4].Value.ToString();
        }

        private void btOtobusEkle_Click(object sender, EventArgs e)
        {
            if (tbOtobusAdi.Text != "" && tbKoltukAdedi.Text != "" && tbKoltukDuzeni.Text != "" && tbBagajHacmi.Text != "")
            {
                SqlCommand cmd = new SqlCommand("insert into Otobusler (OtobusAdi,KoltukAdedi,KoltukDuzeni,BagajHacmi) values(@OtobusAdi,@KoltukAdedi,@KoltukDuzeni,@BagajHacmi)", baglanti);
                baglanti.Open();
                cmd.Parameters.AddWithValue("@OtobusAdi", tbOtobusAdi.Text);
                cmd.Parameters.AddWithValue("@KoltukAdedi", tbKoltukAdedi.Text);
                cmd.Parameters.AddWithValue("@KoltukDuzeni", tbKoltukDuzeni.Text);
                cmd.Parameters.AddWithValue("@BagajHacmi", tbBagajHacmi.Text);

                cmd.ExecuteNonQuery();
                baglanti.Close();
                MessageBox.Show("Kayıt başarıyla eklendi.", "Bilgi", MessageBoxButtons.OK, MessageBoxIcon.Information);
                otobus_getir();
                veri_temizle();
            }
            else
            {
                MessageBox.Show("Eksik ya da hatalı giriş yaptınız.", "Uyarı", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }

        private void btOtobusTemizle_Click(object sender, EventArgs e)
        {
            veri_temizle();
        }

        private void btOtobusSil_Click(object sender, EventArgs e)
        {
            SqlCommand cmd = new SqlCommand("delete from Otobusler where OtobusID = @OtobusID", baglanti);
            baglanti.Open();
            cmd.Parameters.AddWithValue("@OtobusID", dgvOtobusler.Rows[dgvOtobusler.SelectedRows[0].Index].Cells[0].Value);
            cmd.ExecuteNonQuery();
            baglanti.Close();
            MessageBox.Show("Kayıt başarıyla silindi.", "Bilgi", MessageBoxButtons.OK, MessageBoxIcon.Information);
            otobus_getir();
            veri_temizle();
        }

        private void btOtobusGuncelle_Click(object sender, EventArgs e)
        {
            if (tbOtobusAdi.Text != "" && tbKoltukAdedi.Text != "" && tbKoltukDuzeni.Text != "" && tbBagajHacmi.Text != "")
            {
                if (tbKoltukDuzeni.Text.Length != 3)
                {
                    MessageBox.Show("Koltuk düzeni 'x+x' veya 'x+y' formatında olmalıdır.", "Uyarı", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    return;
                }

                SqlCommand cmd = new SqlCommand("update Otobusler set OtobusAdi = @OtobusAdi, KoltukAdedi = @KoltukAdedi, KoltukDuzeni = @KoltukDuzeni, BagajHacmi = @BagajHacmi where OtobusID = @EOtobusID", baglanti);
                baglanti.Open();
                cmd.Parameters.AddWithValue("@EOtobusID", dgvOtobusler.Rows[dgvOtobusler.SelectedRows[0].Index].Cells[0].Value);
                cmd.Parameters.AddWithValue("@OtobusID", tbOtobusID.Text);
                cmd.Parameters.AddWithValue("@OtobusAdi", tbOtobusAdi.Text);
                cmd.Parameters.AddWithValue("@KoltukAdedi", tbKoltukAdedi.Text);
                cmd.Parameters.AddWithValue("@KoltukDuzeni", tbKoltukDuzeni.Text);
                cmd.Parameters.AddWithValue("@BagajHacmi", tbBagajHacmi.Text);

                cmd.ExecuteNonQuery();
                baglanti.Close();
                MessageBox.Show("Kayıt başarıyla güncellendi", "Bilgi", MessageBoxButtons.OK, MessageBoxIcon.Information);
                otobus_getir();
                veri_temizle();
            }
            else
            {
                MessageBox.Show("Eksik bilgiler var.", "Uyarı", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }

        private void veri_temizle()
        {
            tbOtobusID.Text = "";
            tbOtobusAdi.Text = "";
            tbKoltukAdedi.Text = "";
            tbKoltukDuzeni.Text = "";
            tbBagajHacmi.Text = "";
        }
       

        private void dgvOtobusler_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void tbKoltukAdedi_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
