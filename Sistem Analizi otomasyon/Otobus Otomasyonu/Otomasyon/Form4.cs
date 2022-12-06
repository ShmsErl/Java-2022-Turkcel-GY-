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

namespace Otomasyon
{
    public partial class Form4 : Form
    {
        SqlConnection baglanti;
        public Form4()
        {
            InitializeComponent();
            baglanti = new SqlConnection("Data Source=DESKTOP-J6VV81B\\SEHMUS;Initial Catalog=otomasyon3;Integrated Security=True");
            sefer_getir();
            otobusleri_getir();
        }

        private void sefer_getir()
        {
            baglanti.Open();
            string sql = "select * from Seferler";
            SqlCommand komut = new SqlCommand(sql, baglanti);
            SqlDataAdapter da = new SqlDataAdapter(komut);
            DataTable dt = new DataTable();
            da.Fill(dt);
            dgvSeferler.DataSource = dt;
            baglanti.Close();
        }

        private void dgvSeferler_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            decimal ID = Convert.ToInt32(dgvSeferler.Rows[e.RowIndex].Cells[0].Value);
            tbSeferNo.Text = ID + "";
            tbSeferAdi.Text = dgvSeferler.Rows[e.RowIndex].Cells[1].Value.ToString();
            dtpSeferTarihi.Text = dgvSeferler.Rows[e.RowIndex].Cells[2].Value.ToString();
            tbSeferSaati.Text = dgvSeferler.Rows[e.RowIndex].Cells[3].Value.ToString();
            cbOtobusAdi.Text = dgvSeferler.Rows[e.RowIndex].Cells[4].Value.ToString();
            tbPeronNo.Text = dgvSeferler.Rows[e.RowIndex].Cells[5].Value.ToString();
            tbSeferUcreti.Text = dgvSeferler.Rows[e.RowIndex].Cells[6].Value.ToString();
        }

        private void btOtobusEkle_Click(object sender, EventArgs e)
        {
            if (tbSeferNo.Text != "" && tbSeferAdi.Text != "" && tbSeferSaati.Text != "" && tbPeronNo.Text != "" && cbOtobusAdi.Text != "" && tbSeferUcreti.Text != "" && dtpSeferTarihi.Text != "")
            {
                SqlCommand cmd = new SqlCommand("insert into Seferler(SeferNo, SeferAdi, SeferTarihi, SeferSaati, OtobusAdi, PeronNo, SeferUcreti) values(@SeferNo, @SeferAdi, @SeferTarihi ,@SeferSaati, @OtobusAdi, @PeronNo, @SeferUcreti)", baglanti);
                baglanti.Open();

                cmd.Parameters.AddWithValue("@SeferNo", tbSeferNo.Text);
                cmd.Parameters.AddWithValue("@SeferAdi", tbSeferAdi.Text);
                cmd.Parameters.AddWithValue("@SeferTarihi", dtpSeferTarihi.Text);
                cmd.Parameters.AddWithValue("@SeferSaati", tbSeferSaati.Text);
                cmd.Parameters.AddWithValue("@OtobusAdi", cbOtobusAdi.Text);
                cmd.Parameters.AddWithValue("@PeronNo", tbPeronNo.Text);
                cmd.Parameters.AddWithValue("@SeferUcreti", tbSeferUcreti.Text);

                cmd.ExecuteNonQuery();
                baglanti.Close();
                MessageBox.Show("Kayıt başarıyla eklendi.", "Bilgi", MessageBoxButtons.OK, MessageBoxIcon.Information);
                sefer_getir();
                veri_temizle();
            }
            else
            {
                MessageBox.Show("Eksik ya da hatalı giriş yaptınız.", "Uyarı", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }

        private void btOtobusSil_Click(object sender, EventArgs e)
        {
            SqlCommand cmd = new SqlCommand("delete from Seferler where SeferNo = @SeferNo", baglanti);
            baglanti.Open();
            cmd.Parameters.AddWithValue("@SeferNo", dgvSeferler.Rows[dgvSeferler.SelectedRows[0].Index].Cells[0].Value);
            cmd.ExecuteNonQuery();
            baglanti.Close();
            MessageBox.Show("Kayıt başarıyla silindi.", "Bilgi", MessageBoxButtons.OK, MessageBoxIcon.Information);
            sefer_getir();
            veri_temizle();
        }

        private void btOtobusGuncelle_Click(object sender, EventArgs e)
        {
            if (tbSeferNo.Text != "" && tbSeferAdi.Text != "" && tbSeferSaati.Text != "" && tbPeronNo.Text != "" && cbOtobusAdi.Text != "" && tbSeferUcreti.Text != "" && dtpSeferTarihi.Text != "")
            {
                SqlCommand cmd = new SqlCommand("update Seferler set SeferAdi = @SeferAdi, SeferTarihi = @SeferTarihi, SeferSaati = @SeferSaati, OtobusAdi = @OtobusAdi, PeronNo = @PeronNo, SeferUcreti = @SeferUcreti where SeferNo = @ESeferNo", baglanti);
                baglanti.Open();
                cmd.Parameters.AddWithValue("@ESeferNo", dgvSeferler.Rows[dgvSeferler.SelectedRows[0].Index].Cells[0].Value);
                cmd.Parameters.AddWithValue("@SeferNo", tbSeferNo.Text);
                cmd.Parameters.AddWithValue("@SeferAdi", tbSeferAdi.Text);
                cmd.Parameters.AddWithValue("@SeferTarihi", dtpSeferTarihi.Text);
                cmd.Parameters.AddWithValue("@SeferSaati", tbSeferSaati.Text);
                cmd.Parameters.AddWithValue("@OtobusAdi", cbOtobusAdi.Text);
                cmd.Parameters.AddWithValue("@PeronNo", tbPeronNo.Text);
                cmd.Parameters.AddWithValue("@SeferUcreti", tbSeferUcreti.Text);

                cmd.ExecuteNonQuery();
                baglanti.Close();
                MessageBox.Show("Kayıt başarıyla güncellendi", "Bilgi", MessageBoxButtons.OK, MessageBoxIcon.Information);
                sefer_getir();
                veri_temizle();
            }
            else
            {
                MessageBox.Show("Eksik bilgiler var.", "Uyarı", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }

        private void btOtobusTemizle_Click(object sender, EventArgs e)
        {
            veri_temizle();
        }

        private void veri_temizle()
        {
            tbSeferNo.Text = "";
            tbSeferAdi.Text = "";
            dtpSeferTarihi.Text = "";
            tbSeferSaati.Text = "";
            cbOtobusAdi.Text = "";
            tbPeronNo.Text = "";
            tbSeferUcreti.Text = "";
        }

        private void otobusleri_getir()
        {
            string query = "select OtobusAdi from Otobusler";
            SqlCommand cmd = new SqlCommand();
            cmd.Connection = baglanti;
            cmd.CommandText = query;
            SqlDataAdapter da = new SqlDataAdapter();
            da.SelectCommand = cmd;
            DataTable dt = new DataTable();
            da.Fill(dt);
            cbOtobusAdi.DataSource = dt;
            cbOtobusAdi.DisplayMember = "OtobusAdi";
        }

        private void gbSeferİslemleri_Enter(object sender, EventArgs e)
        {

        }
    }
}
