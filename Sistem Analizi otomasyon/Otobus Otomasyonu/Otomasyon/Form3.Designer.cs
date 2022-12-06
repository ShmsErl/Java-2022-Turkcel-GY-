namespace Otomasyon
{
    partial class Form3
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form3));
            this.label1 = new System.Windows.Forms.Label();
            this.dgvOtobusler = new System.Windows.Forms.DataGridView();
            this.tbOtobusID = new System.Windows.Forms.TextBox();
            this.tbOtobusAdi = new System.Windows.Forms.TextBox();
            this.tbKoltukAdedi = new System.Windows.Forms.TextBox();
            this.tbKoltukDuzeni = new System.Windows.Forms.TextBox();
            this.tbBagajHacmi = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.gbOtobusBilgileri = new System.Windows.Forms.GroupBox();
            this.btOtobusTemizle = new System.Windows.Forms.Button();
            this.btOtobusGuncelle = new System.Windows.Forms.Button();
            this.btOtobusSil = new System.Windows.Forms.Button();
            this.btOtobusEkle = new System.Windows.Forms.Button();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.button15 = new System.Windows.Forms.Button();
            this.button19 = new System.Windows.Forms.Button();
            this.button18 = new System.Windows.Forms.Button();
            this.button17 = new System.Windows.Forms.Button();
            this.button16 = new System.Windows.Forms.Button();
            this.button10 = new System.Windows.Forms.Button();
            this.button9 = new System.Windows.Forms.Button();
            this.button14 = new System.Windows.Forms.Button();
            this.button8 = new System.Windows.Forms.Button();
            this.button7 = new System.Windows.Forms.Button();
            this.button13 = new System.Windows.Forms.Button();
            this.button6 = new System.Windows.Forms.Button();
            this.button5 = new System.Windows.Forms.Button();
            this.button12 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button11 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dgvOtobusler)).BeginInit();
            this.gbOtobusBilgileri.SuspendLayout();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Candara", 25.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label1.Location = new System.Drawing.Point(172, 7);
            this.label1.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(251, 41);
            this.label1.TabIndex = 1;
            this.label1.Text = "Otobüs İşlemleri";
            // 
            // dgvOtobusler
            // 
            this.dgvOtobusler.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvOtobusler.GridColor = System.Drawing.SystemColors.ControlLight;
            this.dgvOtobusler.Location = new System.Drawing.Point(27, 64);
            this.dgvOtobusler.Margin = new System.Windows.Forms.Padding(2);
            this.dgvOtobusler.Name = "dgvOtobusler";
            this.dgvOtobusler.RowTemplate.Height = 24;
            this.dgvOtobusler.Size = new System.Drawing.Size(533, 162);
            this.dgvOtobusler.TabIndex = 2;
            this.dgvOtobusler.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dgvOtobusler_CellContentClick);
            this.dgvOtobusler.RowHeaderMouseClick += new System.Windows.Forms.DataGridViewCellMouseEventHandler(this.dgvOtobusler_RowHeaderMouseClick);
            // 
            // tbOtobusID
            // 
            this.tbOtobusID.Location = new System.Drawing.Point(104, 45);
            this.tbOtobusID.Margin = new System.Windows.Forms.Padding(2);
            this.tbOtobusID.Name = "tbOtobusID";
            this.tbOtobusID.ReadOnly = true;
            this.tbOtobusID.Size = new System.Drawing.Size(117, 23);
            this.tbOtobusID.TabIndex = 1;
            // 
            // tbOtobusAdi
            // 
            this.tbOtobusAdi.Location = new System.Drawing.Point(104, 77);
            this.tbOtobusAdi.Margin = new System.Windows.Forms.Padding(2);
            this.tbOtobusAdi.Name = "tbOtobusAdi";
            this.tbOtobusAdi.Size = new System.Drawing.Size(117, 23);
            this.tbOtobusAdi.TabIndex = 2;
            // 
            // tbKoltukAdedi
            // 
            this.tbKoltukAdedi.Location = new System.Drawing.Point(104, 111);
            this.tbKoltukAdedi.Margin = new System.Windows.Forms.Padding(2);
            this.tbKoltukAdedi.Name = "tbKoltukAdedi";
            this.tbKoltukAdedi.Size = new System.Drawing.Size(117, 23);
            this.tbKoltukAdedi.TabIndex = 3;
            this.tbKoltukAdedi.TextChanged += new System.EventHandler(this.tbKoltukAdedi_TextChanged);
            // 
            // tbKoltukDuzeni
            // 
            this.tbKoltukDuzeni.Location = new System.Drawing.Point(382, 45);
            this.tbKoltukDuzeni.Margin = new System.Windows.Forms.Padding(2);
            this.tbKoltukDuzeni.Name = "tbKoltukDuzeni";
            this.tbKoltukDuzeni.Size = new System.Drawing.Size(117, 23);
            this.tbKoltukDuzeni.TabIndex = 4;
            // 
            // tbBagajHacmi
            // 
            this.tbBagajHacmi.Location = new System.Drawing.Point(382, 77);
            this.tbBagajHacmi.Margin = new System.Windows.Forms.Padding(2);
            this.tbBagajHacmi.Name = "tbBagajHacmi";
            this.tbBagajHacmi.Size = new System.Drawing.Size(117, 23);
            this.tbBagajHacmi.TabIndex = 5;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Candara", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label2.ForeColor = System.Drawing.Color.Yellow;
            this.label2.Location = new System.Drawing.Point(10, 47);
            this.label2.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(76, 17);
            this.label2.TabIndex = 4;
            this.label2.Text = "Otobüs ID :";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Candara", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label3.Location = new System.Drawing.Point(10, 80);
            this.label3.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(83, 17);
            this.label3.TabIndex = 4;
            this.label3.Text = "Otobüs Adı :";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Candara", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label4.Location = new System.Drawing.Point(10, 114);
            this.label4.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(92, 17);
            this.label4.TabIndex = 4;
            this.label4.Text = "Koltuk Adedi :";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Candara", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label5.Location = new System.Drawing.Point(263, 47);
            this.label5.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(98, 17);
            this.label5.TabIndex = 4;
            this.label5.Text = "Koltuk Düzeni :";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Font = new System.Drawing.Font("Candara", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.label6.Location = new System.Drawing.Point(263, 82);
            this.label6.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(115, 17);
            this.label6.TabIndex = 4;
            this.label6.Text = "Bagaj Hacmi (m³) :";
            // 
            // gbOtobusBilgileri
            // 
            this.gbOtobusBilgileri.Controls.Add(this.btOtobusTemizle);
            this.gbOtobusBilgileri.Controls.Add(this.btOtobusGuncelle);
            this.gbOtobusBilgileri.Controls.Add(this.btOtobusSil);
            this.gbOtobusBilgileri.Controls.Add(this.btOtobusEkle);
            this.gbOtobusBilgileri.Controls.Add(this.label2);
            this.gbOtobusBilgileri.Controls.Add(this.label6);
            this.gbOtobusBilgileri.Controls.Add(this.label5);
            this.gbOtobusBilgileri.Controls.Add(this.tbOtobusID);
            this.gbOtobusBilgileri.Controls.Add(this.label4);
            this.gbOtobusBilgileri.Controls.Add(this.tbOtobusAdi);
            this.gbOtobusBilgileri.Controls.Add(this.label3);
            this.gbOtobusBilgileri.Controls.Add(this.tbKoltukAdedi);
            this.gbOtobusBilgileri.Controls.Add(this.tbKoltukDuzeni);
            this.gbOtobusBilgileri.Controls.Add(this.tbBagajHacmi);
            this.gbOtobusBilgileri.Font = new System.Drawing.Font("Microsoft Sans Serif", 10.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(162)));
            this.gbOtobusBilgileri.ForeColor = System.Drawing.Color.Yellow;
            this.gbOtobusBilgileri.Location = new System.Drawing.Point(27, 245);
            this.gbOtobusBilgileri.Margin = new System.Windows.Forms.Padding(2);
            this.gbOtobusBilgileri.Name = "gbOtobusBilgileri";
            this.gbOtobusBilgileri.Padding = new System.Windows.Forms.Padding(2);
            this.gbOtobusBilgileri.Size = new System.Drawing.Size(533, 171);
            this.gbOtobusBilgileri.TabIndex = 5;
            this.gbOtobusBilgileri.TabStop = false;
            this.gbOtobusBilgileri.Text = "Otobüs Bilgileri";
            // 
            // btOtobusTemizle
            // 
            this.btOtobusTemizle.Font = new System.Drawing.Font("Candara", 9.5F);
            this.btOtobusTemizle.ForeColor = System.Drawing.Color.Black;
            this.btOtobusTemizle.Location = new System.Drawing.Point(454, 111);
            this.btOtobusTemizle.Margin = new System.Windows.Forms.Padding(2);
            this.btOtobusTemizle.Name = "btOtobusTemizle";
            this.btOtobusTemizle.Size = new System.Drawing.Size(67, 23);
            this.btOtobusTemizle.TabIndex = 9;
            this.btOtobusTemizle.Text = "Temizle";
            this.btOtobusTemizle.UseVisualStyleBackColor = true;
            this.btOtobusTemizle.Click += new System.EventHandler(this.btOtobusTemizle_Click);
            // 
            // btOtobusGuncelle
            // 
            this.btOtobusGuncelle.Font = new System.Drawing.Font("Candara", 9.5F);
            this.btOtobusGuncelle.ForeColor = System.Drawing.Color.Black;
            this.btOtobusGuncelle.Location = new System.Drawing.Point(382, 110);
            this.btOtobusGuncelle.Margin = new System.Windows.Forms.Padding(2);
            this.btOtobusGuncelle.Name = "btOtobusGuncelle";
            this.btOtobusGuncelle.Size = new System.Drawing.Size(67, 23);
            this.btOtobusGuncelle.TabIndex = 8;
            this.btOtobusGuncelle.Text = "Güncelle";
            this.btOtobusGuncelle.UseVisualStyleBackColor = true;
            this.btOtobusGuncelle.Click += new System.EventHandler(this.btOtobusGuncelle_Click);
            // 
            // btOtobusSil
            // 
            this.btOtobusSil.Font = new System.Drawing.Font("Candara", 9.5F);
            this.btOtobusSil.ForeColor = System.Drawing.Color.Black;
            this.btOtobusSil.Location = new System.Drawing.Point(311, 110);
            this.btOtobusSil.Margin = new System.Windows.Forms.Padding(2);
            this.btOtobusSil.Name = "btOtobusSil";
            this.btOtobusSil.Size = new System.Drawing.Size(67, 23);
            this.btOtobusSil.TabIndex = 7;
            this.btOtobusSil.Text = "Sil";
            this.btOtobusSil.UseVisualStyleBackColor = true;
            this.btOtobusSil.Click += new System.EventHandler(this.btOtobusSil_Click);
            // 
            // btOtobusEkle
            // 
            this.btOtobusEkle.Font = new System.Drawing.Font("Candara", 9.5F);
            this.btOtobusEkle.ForeColor = System.Drawing.Color.Black;
            this.btOtobusEkle.Location = new System.Drawing.Point(240, 110);
            this.btOtobusEkle.Margin = new System.Windows.Forms.Padding(2);
            this.btOtobusEkle.Name = "btOtobusEkle";
            this.btOtobusEkle.Size = new System.Drawing.Size(67, 23);
            this.btOtobusEkle.TabIndex = 6;
            this.btOtobusEkle.Text = "Ekle";
            this.btOtobusEkle.UseVisualStyleBackColor = true;
            this.btOtobusEkle.Click += new System.EventHandler(this.btOtobusEkle_Click);
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.button15);
            this.groupBox1.Controls.Add(this.button19);
            this.groupBox1.Controls.Add(this.button18);
            this.groupBox1.Controls.Add(this.button17);
            this.groupBox1.Controls.Add(this.button16);
            this.groupBox1.Controls.Add(this.button10);
            this.groupBox1.Controls.Add(this.button9);
            this.groupBox1.Controls.Add(this.button14);
            this.groupBox1.Controls.Add(this.button8);
            this.groupBox1.Controls.Add(this.button7);
            this.groupBox1.Controls.Add(this.button13);
            this.groupBox1.Controls.Add(this.button6);
            this.groupBox1.Controls.Add(this.button5);
            this.groupBox1.Controls.Add(this.button12);
            this.groupBox1.Controls.Add(this.button4);
            this.groupBox1.Controls.Add(this.button3);
            this.groupBox1.Controls.Add(this.button11);
            this.groupBox1.Controls.Add(this.button2);
            this.groupBox1.Controls.Add(this.button1);
            this.groupBox1.ForeColor = System.Drawing.Color.Black;
            this.groupBox1.Location = new System.Drawing.Point(594, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(315, 404);
            this.groupBox1.TabIndex = 11;
            this.groupBox1.TabStop = false;
            // 
            // button15
            // 
            this.button15.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button15.BackgroundImage")));
            this.button15.Location = new System.Drawing.Point(255, 296);
            this.button15.Name = "button15";
            this.button15.Size = new System.Drawing.Size(54, 45);
            this.button15.TabIndex = 0;
            this.button15.Text = "16";
            this.button15.UseVisualStyleBackColor = true;
            // 
            // button19
            // 
            this.button19.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button19.BackgroundImage")));
            this.button19.Location = new System.Drawing.Point(218, 353);
            this.button19.Name = "button19";
            this.button19.Size = new System.Drawing.Size(54, 45);
            this.button19.TabIndex = 0;
            this.button19.Text = "20";
            this.button19.UseVisualStyleBackColor = true;
            // 
            // button18
            // 
            this.button18.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button18.BackgroundImage")));
            this.button18.Location = new System.Drawing.Point(158, 353);
            this.button18.Name = "button18";
            this.button18.Size = new System.Drawing.Size(54, 45);
            this.button18.TabIndex = 0;
            this.button18.Text = "19";
            this.button18.UseVisualStyleBackColor = true;
            // 
            // button17
            // 
            this.button17.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button17.BackgroundImage")));
            this.button17.Location = new System.Drawing.Point(100, 353);
            this.button17.Name = "button17";
            this.button17.Size = new System.Drawing.Size(54, 45);
            this.button17.TabIndex = 0;
            this.button17.Text = "18";
            this.button17.UseVisualStyleBackColor = true;
            // 
            // button16
            // 
            this.button16.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button16.BackgroundImage")));
            this.button16.Location = new System.Drawing.Point(40, 353);
            this.button16.Name = "button16";
            this.button16.Size = new System.Drawing.Size(54, 45);
            this.button16.TabIndex = 0;
            this.button16.Text = "17";
            this.button16.UseVisualStyleBackColor = true;
            // 
            // button10
            // 
            this.button10.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button10.BackgroundImage")));
            this.button10.Location = new System.Drawing.Point(100, 296);
            this.button10.Name = "button10";
            this.button10.Size = new System.Drawing.Size(54, 45);
            this.button10.TabIndex = 0;
            this.button10.Text = "15";
            this.button10.UseVisualStyleBackColor = true;
            // 
            // button9
            // 
            this.button9.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button9.BackgroundImage")));
            this.button9.Location = new System.Drawing.Point(40, 296);
            this.button9.Name = "button9";
            this.button9.Size = new System.Drawing.Size(54, 45);
            this.button9.TabIndex = 0;
            this.button9.Text = "14";
            this.button9.UseVisualStyleBackColor = true;
            // 
            // button14
            // 
            this.button14.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button14.BackgroundImage")));
            this.button14.Location = new System.Drawing.Point(255, 237);
            this.button14.Name = "button14";
            this.button14.Size = new System.Drawing.Size(54, 45);
            this.button14.TabIndex = 0;
            this.button14.Text = "13";
            this.button14.UseVisualStyleBackColor = true;
            // 
            // button8
            // 
            this.button8.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button8.BackgroundImage")));
            this.button8.Location = new System.Drawing.Point(100, 237);
            this.button8.Name = "button8";
            this.button8.Size = new System.Drawing.Size(54, 45);
            this.button8.TabIndex = 0;
            this.button8.Text = "12";
            this.button8.UseVisualStyleBackColor = true;
            // 
            // button7
            // 
            this.button7.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button7.BackgroundImage")));
            this.button7.Location = new System.Drawing.Point(40, 237);
            this.button7.Name = "button7";
            this.button7.Size = new System.Drawing.Size(54, 45);
            this.button7.TabIndex = 0;
            this.button7.Text = "11";
            this.button7.UseVisualStyleBackColor = true;
            // 
            // button13
            // 
            this.button13.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button13.BackgroundImage")));
            this.button13.Location = new System.Drawing.Point(255, 178);
            this.button13.Name = "button13";
            this.button13.Size = new System.Drawing.Size(54, 45);
            this.button13.TabIndex = 0;
            this.button13.Text = "10";
            this.button13.UseVisualStyleBackColor = true;
            // 
            // button6
            // 
            this.button6.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button6.BackgroundImage")));
            this.button6.Location = new System.Drawing.Point(100, 178);
            this.button6.Name = "button6";
            this.button6.Size = new System.Drawing.Size(54, 45);
            this.button6.TabIndex = 0;
            this.button6.Text = "9";
            this.button6.UseVisualStyleBackColor = true;
            // 
            // button5
            // 
            this.button5.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button5.BackgroundImage")));
            this.button5.Location = new System.Drawing.Point(40, 178);
            this.button5.Name = "button5";
            this.button5.Size = new System.Drawing.Size(54, 45);
            this.button5.TabIndex = 0;
            this.button5.Text = "8";
            this.button5.UseVisualStyleBackColor = true;
            // 
            // button12
            // 
            this.button12.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button12.BackgroundImage")));
            this.button12.Location = new System.Drawing.Point(255, 115);
            this.button12.Name = "button12";
            this.button12.Size = new System.Drawing.Size(54, 45);
            this.button12.TabIndex = 0;
            this.button12.Text = "7";
            this.button12.UseVisualStyleBackColor = true;
            // 
            // button4
            // 
            this.button4.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button4.BackgroundImage")));
            this.button4.Location = new System.Drawing.Point(100, 115);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(54, 45);
            this.button4.TabIndex = 0;
            this.button4.Text = "5";
            this.button4.UseVisualStyleBackColor = true;
            // 
            // button3
            // 
            this.button3.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button3.BackgroundImage")));
            this.button3.Location = new System.Drawing.Point(40, 115);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(54, 45);
            this.button3.TabIndex = 0;
            this.button3.Text = "4";
            this.button3.UseVisualStyleBackColor = true;
            // 
            // button11
            // 
            this.button11.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button11.BackgroundImage")));
            this.button11.Location = new System.Drawing.Point(255, 52);
            this.button11.Name = "button11";
            this.button11.Size = new System.Drawing.Size(54, 45);
            this.button11.TabIndex = 0;
            this.button11.Text = "3";
            this.button11.UseVisualStyleBackColor = true;
            // 
            // button2
            // 
            this.button2.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button2.BackgroundImage")));
            this.button2.Location = new System.Drawing.Point(100, 52);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(54, 45);
            this.button2.TabIndex = 0;
            this.button2.Text = "2";
            this.button2.UseVisualStyleBackColor = true;
            // 
            // button1
            // 
            this.button1.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button1.BackgroundImage")));
            this.button1.Location = new System.Drawing.Point(40, 52);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(54, 45);
            this.button1.TabIndex = 0;
            this.button1.Text = "1";
            this.button1.UseVisualStyleBackColor = true;
            // 
            // Form3
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.DarkMagenta;
            this.ClientSize = new System.Drawing.Size(921, 446);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.gbOtobusBilgileri);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dgvOtobusler);
            this.ForeColor = System.Drawing.Color.Black;
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "Form3";
            this.Text = "Otobüs İşlemleri";
            ((System.ComponentModel.ISupportInitialize)(this.dgvOtobusler)).EndInit();
            this.gbOtobusBilgileri.ResumeLayout(false);
            this.gbOtobusBilgileri.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridView dgvOtobusler;
        private System.Windows.Forms.TextBox tbOtobusID;
        private System.Windows.Forms.TextBox tbOtobusAdi;
        private System.Windows.Forms.TextBox tbKoltukAdedi;
        private System.Windows.Forms.TextBox tbKoltukDuzeni;
        private System.Windows.Forms.TextBox tbBagajHacmi;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.GroupBox gbOtobusBilgileri;
        private System.Windows.Forms.Button btOtobusTemizle;
        private System.Windows.Forms.Button btOtobusGuncelle;
        private System.Windows.Forms.Button btOtobusSil;
        private System.Windows.Forms.Button btOtobusEkle;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Button button15;
        private System.Windows.Forms.Button button19;
        private System.Windows.Forms.Button button18;
        private System.Windows.Forms.Button button17;
        private System.Windows.Forms.Button button16;
        private System.Windows.Forms.Button button10;
        private System.Windows.Forms.Button button9;
        private System.Windows.Forms.Button button14;
        private System.Windows.Forms.Button button8;
        private System.Windows.Forms.Button button7;
        private System.Windows.Forms.Button button13;
        private System.Windows.Forms.Button button6;
        private System.Windows.Forms.Button button5;
        private System.Windows.Forms.Button button12;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button11;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button1;
    }
}