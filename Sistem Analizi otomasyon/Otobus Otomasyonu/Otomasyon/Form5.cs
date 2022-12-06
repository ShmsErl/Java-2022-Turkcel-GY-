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
    public partial class Form5 : Form
    {
        SqlConnection baglanti;
        public Form5()
        {
            InitializeComponent();
            baglanti = new SqlConnection("Data Source=DESKTOP-J6VV81B\\SEHMUS;Initial Catalog=otomasyon3;Integrated Security=True");
            sefer_getir();
        }

        private void sefer_getir()
        {
            baglanti.Open();
            string sql = "select * from Seferler";
            SqlCommand komut = new SqlCommand(sql, baglanti);
            SqlDataAdapter da = new SqlDataAdapter(komut);
            DataTable dt = new DataTable();
            da.Fill(dt);
            dgvSeferler2.DataSource = dt;
            baglanti.Close();
        }

        private void dgvSeferler2_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {
            decimal ID = Convert.ToInt32(dgvSeferler2.Rows[e.RowIndex].Cells[0].Value);
            tbSeferNo.Text = ID + "";
            tbSeferAdi.Text = dgvSeferler2.Rows[e.RowIndex].Cells[1].Value.ToString();
            tbSeferTarihi.Text = dgvSeferler2.Rows[e.RowIndex].Cells[2].Value.ToString();
            tbSeferSaati.Text = dgvSeferler2.Rows[e.RowIndex].Cells[3].Value.ToString();
            tbOtobusAdi.Text = dgvSeferler2.Rows[e.RowIndex].Cells[4].Value.ToString();
            tbPeronNo.Text = dgvSeferler2.Rows[e.RowIndex].Cells[5].Value.ToString();
            tbSeferUcreti.Text = dgvSeferler2.Rows[e.RowIndex].Cells[6].Value.ToString();
        }

        private void btRezervasyonYap_Click(object sender, EventArgs e)
        {
            if (tbMusteriAdi.Text != "" && tbMusteriSoyadi.Text != "" && tbMusteriTelNo.Text != "" && (rbErkek.Checked != true || rbKadın.Checked != true))
            {
                SqlCommand cmd = new SqlCommand("insert into Sefer_Musteri(MusteriAdi, MusteriSoyadi, MusteriCinsiyeti, MusteriTelNo, MusteriSeferi, KoltukNo) values(@MusteriAdi, @MusteriSoyadi, @MusteriCinsiyeti, @MusteriTelNo, @MusteriSeferi, @KoltukNo)", baglanti);
                baglanti.Open();

                cmd.Parameters.AddWithValue("@MusteriAdi", tbMusteriAdi.Text);
                cmd.Parameters.AddWithValue("@MusteriSoyadi", tbMusteriSoyadi.Text);

                if(rbErkek.Checked == true)
                    cmd.Parameters.AddWithValue("@MusteriCinsiyeti", rbErkek.Text);
                else
                    cmd.Parameters.AddWithValue("@MusteriCinsiyeti", rbKadın.Text);

                cmd.Parameters.AddWithValue("@MusteriTelNo", tbMusteriTelNo.Text);
                cmd.Parameters.AddWithValue("@MusteriSeferi", tbSeferNo.Text);
                cmd.Parameters.AddWithValue("@KoltukNo", tbKoltukNo.Text);

                cmd.ExecuteNonQuery();
                baglanti.Close();
                MessageBox.Show("Kayıt başarıyla eklendi.", "Bilgi", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
            else
            {
                MessageBox.Show("Eksik ya da hatalı giriş yaptınız.", "Uyarı", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }
        }

        private void Form5_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "1";
            if (rbErkek.Checked)
               
               
            {
                btn1.BackColor = Color.LightBlue;
            }
            else if (rbKadın.Checked)
            {
                btn1.BackColor = Color.Pink;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "2";
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "3";
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "4";
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "5";
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "7";
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "8";
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "9";
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "10";
        }

        private void btn10_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "11";
        }

        private void btn11_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "12";
        }

        private void btn12_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "13";
        }

        private void btn13_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "14";
        }

        private void btn14_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "15";
        }

        private void button15_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "16";
        }

        private void button16_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "17";
        }

        private void button17_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "18";
        }

        private void button18_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "19";
        }

        private void button19_Click(object sender, EventArgs e)
        {
            tbKoltukNo.Text = "20";
        }
    }
}
