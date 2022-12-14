USE [master]
GO
/****** Object:  Database [otomasyon3]    Script Date: 8.05.2020 20:53:43 ******/
CREATE DATABASE [otomasyon3]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'otomasyon3', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SEHMUS\MSSQL\DATA\otomasyon3.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'otomasyon3_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SEHMUS\MSSQL\DATA\otomasyon3_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [otomasyon3] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [otomasyon3].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [otomasyon3] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [otomasyon3] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [otomasyon3] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [otomasyon3] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [otomasyon3] SET ARITHABORT OFF 
GO
ALTER DATABASE [otomasyon3] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [otomasyon3] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [otomasyon3] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [otomasyon3] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [otomasyon3] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [otomasyon3] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [otomasyon3] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [otomasyon3] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [otomasyon3] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [otomasyon3] SET  DISABLE_BROKER 
GO
ALTER DATABASE [otomasyon3] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [otomasyon3] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [otomasyon3] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [otomasyon3] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [otomasyon3] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [otomasyon3] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [otomasyon3] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [otomasyon3] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [otomasyon3] SET  MULTI_USER 
GO
ALTER DATABASE [otomasyon3] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [otomasyon3] SET DB_CHAINING OFF 
GO
ALTER DATABASE [otomasyon3] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [otomasyon3] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [otomasyon3] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [otomasyon3] SET QUERY_STORE = OFF
GO
USE [otomasyon3]
GO
/****** Object:  Table [dbo].[Otobusler]    Script Date: 8.05.2020 20:53:43 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Otobusler](
	[OtobusID] [int] IDENTITY(1,1) NOT NULL,
	[OtobusAdi] [varchar](50) NOT NULL,
	[KoltukAdedi] [varchar](50) NOT NULL,
	[KoltukDuzeni] [varchar](50) NOT NULL,
	[BagajHacmi] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Otobusler] PRIMARY KEY CLUSTERED 
(
	[OtobusID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sefer_Musteri]    Script Date: 8.05.2020 20:53:43 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sefer_Musteri](
	[MusteriNo] [int] IDENTITY(1,1) NOT NULL,
	[MusteriAdi] [varchar](50) NOT NULL,
	[MusteriSoyadi] [varchar](50) NOT NULL,
	[MusteriCinsiyeti] [varchar](50) NOT NULL,
	[MusteriTelNo] [decimal](10, 0) NOT NULL,
	[MusteriSeferi] [int] NOT NULL,
	[KoltukNo] [int] NULL,
 CONSTRAINT [PK_Sefer_Musteri] PRIMARY KEY CLUSTERED 
(
	[MusteriNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Seferler]    Script Date: 8.05.2020 20:53:43 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Seferler](
	[SeferNo] [int] NOT NULL,
	[SeferAdi] [varchar](50) NOT NULL,
	[SeferTarihi] [varchar](50) NOT NULL,
	[SeferSaati] [varchar](50) NOT NULL,
	[OtobusAdi] [varchar](50) NOT NULL,
	[PeronNo] [varchar](50) NOT NULL,
	[SeferUcreti] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Seferler] PRIMARY KEY CLUSTERED 
(
	[SeferNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Yoneticiler]    Script Date: 8.05.2020 20:53:43 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Yoneticiler](
	[YoneticiID] [int] IDENTITY(1,1) NOT NULL,
	[YoneticiAdi] [varchar](50) NOT NULL,
	[YoneticiParola] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Yoneticiler] PRIMARY KEY CLUSTERED 
(
	[YoneticiID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Otobusler] ON 

INSERT [dbo].[Otobusler] ([OtobusID], [OtobusAdi], [KoltukAdedi], [KoltukDuzeni], [BagajHacmi]) VALUES (1, N'Class', N'54', N'2+2', N'15,50')
INSERT [dbo].[Otobusler] ([OtobusID], [OtobusAdi], [KoltukAdedi], [KoltukDuzeni], [BagajHacmi]) VALUES (2, N'Mini', N'28', N'2+1', N'5,50')
INSERT [dbo].[Otobusler] ([OtobusID], [OtobusAdi], [KoltukAdedi], [KoltukDuzeni], [BagajHacmi]) VALUES (3, N'VIP', N'32', N'1+1', N'15,50')
INSERT [dbo].[Otobusler] ([OtobusID], [OtobusAdi], [KoltukAdedi], [KoltukDuzeni], [BagajHacmi]) VALUES (4, N'Suit', N'37', N'2+1', N'15,50')
SET IDENTITY_INSERT [dbo].[Otobusler] OFF
GO
SET IDENTITY_INSERT [dbo].[Sefer_Musteri] ON 

INSERT [dbo].[Sefer_Musteri] ([MusteriNo], [MusteriAdi], [MusteriSoyadi], [MusteriCinsiyeti], [MusteriTelNo], [MusteriSeferi], [KoltukNo]) VALUES (4, N'Hulusi', N'Bindebir', N'Erkek', CAST(5555555555 AS Decimal(10, 0)), 654325465, 8)
INSERT [dbo].[Sefer_Musteri] ([MusteriNo], [MusteriAdi], [MusteriSoyadi], [MusteriCinsiyeti], [MusteriTelNo], [MusteriSeferi], [KoltukNo]) VALUES (5, N'test', N'test', N'Kadın', CAST(5555555555 AS Decimal(10, 0)), 654325465, 9)
SET IDENTITY_INSERT [dbo].[Sefer_Musteri] OFF
GO
INSERT [dbo].[Seferler] ([SeferNo], [SeferAdi], [SeferTarihi], [SeferSaati], [OtobusAdi], [PeronNo], [SeferUcreti]) VALUES (254685384, N'Adana-Kayseri', N'15 Mayıs 2020 Cuma', N'20.30', N'VIP', N'5', N'120 TL')
INSERT [dbo].[Seferler] ([SeferNo], [SeferAdi], [SeferTarihi], [SeferSaati], [OtobusAdi], [PeronNo], [SeferUcreti]) VALUES (256345694, N'Osmaniye-Kayseri', N'6 Mayıs 2020 Çarşamba', N'08.00', N'VIP', N'2', N'130 TL')
INSERT [dbo].[Seferler] ([SeferNo], [SeferAdi], [SeferTarihi], [SeferSaati], [OtobusAdi], [PeronNo], [SeferUcreti]) VALUES (536245395, N'Adana-Aksaray', N'17 Mayıs 2020 Pazar', N'22.00', N'Class', N'7', N'70 TL')
INSERT [dbo].[Seferler] ([SeferNo], [SeferAdi], [SeferTarihi], [SeferSaati], [OtobusAdi], [PeronNo], [SeferUcreti]) VALUES (654325465, N'Osmaniye-İskenderun', N'5 Mayıs 2020 Salı', N'16.00', N'Mini', N'11', N'20 TL')
GO
SET IDENTITY_INSERT [dbo].[Yoneticiler] ON 

INSERT [dbo].[Yoneticiler] ([YoneticiID], [YoneticiAdi], [YoneticiParola]) VALUES (1, N'yonetici', N'parola')
SET IDENTITY_INSERT [dbo].[Yoneticiler] OFF
GO
USE [master]
GO
ALTER DATABASE [otomasyon3] SET  READ_WRITE 
GO
