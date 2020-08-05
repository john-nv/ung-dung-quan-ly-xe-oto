USE [QuanLyChoThueXe]
GO
 Object  Table [dbo].[HOPDONG]    Script Date 282020 63019 PM 
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOPDONG](
	[MaHD] [int] NOT NULL,
	[NgayLap] [datetime] NOT NULL,
	[SoCMND] [int] NOT NULL,
	[ThoiGianBatDauHopDong] [datetime] NOT NULL,
	[ThoiGianKetThucHopDong] [datetime] NOT NULL,
	[DiaDiemNhanXe] [nvarchar](50) NOT NULL,
	[DiaDiemTraXe] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](50) NULL,
	[MaLoaiXe] [varchar](50) NOT NULL,
	[MaPK] [varchar](50) NOT NULL,
	[MaThanhToan] [varchar](50) NOT NULL,
	[DatCoc] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_HOPDONG] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
 Object  Table [dbo].[KHACHHANG]    Script Date 282020 63019 PM 
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACHHANG](
	[SoCMND] [int] NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[NamSinh] [date] NOT NULL,
	[SoGPLX] [int] NOT NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_KHACHHANG] PRIMARY KEY CLUSTERED 
(
	[SoCMND] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
 Object  Table [dbo].[LOAIPHUKIEN]    Script Date 282020 63019 PM 
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAIPHUKIEN](
	[MaLoaiPK] [varchar](50) NOT NULL,
	[TenLoaiPK] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LOAIPHUKIEN] PRIMARY KEY CLUSTERED 
(
	[MaLoaiPK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
 Object  Table [dbo].[LOAIXE]    Script Date 282020 63019 PM 
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LOAIXE](
	[MaLoaiXe] [varchar](50) NOT NULL,
	[TenLoaiXe] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_LOAIXE] PRIMARY KEY CLUSTERED 
(
	[MaLoaiXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
 Object  Table [dbo].[PHUKIEN]    Script Date 282020 63019 PM 
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHUKIEN](
	[MaPK] [varchar](50) NOT NULL,
	[TenPK] [nvarchar](50) NOT NULL,
	[TinhTrangPK] [nvarchar](50) NOT NULL,
	[ThoiGianBatDauTinhTrang] [datetime] NULL,
	[ThoiGianKetThucTinhTrang] [datetime] NULL,
	[MaLoaiPK] [varchar](50) NOT NULL,
 CONSTRAINT [PK_PHUKIEN] PRIMARY KEY CLUSTERED 
(
	[MaPK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
 Object  Table [dbo].[Tien]    Script Date 282020 63019 PM 
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tien](
	[MaThanhToan] [varchar](50) NOT NULL,
	[TienThueXe] [decimal](18, 2) NOT NULL,
	[TienSuaChua] [decimal](18, 2) NOT NULL,
	[TongTien] [decimal](18, 2) NOT NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_Tien] PRIMARY KEY CLUSTERED 
(
	[MaThanhToan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
 Object  Table [dbo].[Xe]    Script Date 282020 63019 PM 
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Xe](
	[MaXe] [varchar](50) NOT NULL,
	[TenXe] [nvarchar](50) NOT NULL,
	[SoKhung] [nvarchar](50) NOT NULL,
	[SoMay] [nvarchar](50) NOT NULL,
	[MaLuc] [int] NOT NULL,
	[Hang] [nvarchar](50) NOT NULL,
	[SoCho] [int] NOT NULL,
	[GiaThueXeTheoGio] [decimal](18, 2) NOT NULL,
	[GiaThueXeTheoNgay] [decimal](18, 2) NOT NULL,
	[GiaThueXeTheoThang] [decimal](18, 2) NOT NULL,
	[TienPhat] [decimal](18, 2) NOT NULL,
	[TinhTrangXe] [nvarchar](50) NOT NULL,
	[ThoiGianBatDauTinhTrang] [datetime] NULL,
	[ThoiGianKetThucTinhTrang] [datetime] NULL,
	[MaLoaiXe] [varchar](50) NOT NULL,
	[BienSoXe] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Xe] PRIMARY KEY CLUSTERED 
(
	[MaXe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[KHACHHANG] ([SoCMND], [HoTen], [NamSinh], [SoGPLX], [GhiChu]) VALUES (206270206, N'Nguyễn Văn Chiến', CAST(N'1990-12-12' AS Date), 123000001, NULL)
INSERT [dbo].[KHACHHANG] ([SoCMND], [HoTen], [NamSinh], [SoGPLX], [GhiChu]) VALUES (206270207, N'Lê Thị Dậu', CAST(N'1998-03-02' AS Date), 123000002, NULL)
INSERT [dbo].[KHACHHANG] ([SoCMND], [HoTen], [NamSinh], [SoGPLX], [GhiChu]) VALUES (206270208, N'Nguyễn Văn Chiến', CAST(N'1992-04-04' AS Date), 123000003, NULL)
INSERT [dbo].[KHACHHANG] ([SoCMND], [HoTen], [NamSinh], [SoGPLX], [GhiChu]) VALUES (206270209, N'Nguyễn Văn Tâm', CAST(N'1999-02-01' AS Date), 123000004, NULL)
INSERT [dbo].[KHACHHANG] ([SoCMND], [HoTen], [NamSinh], [SoGPLX], [GhiChu]) VALUES (206270210, N'Nguyễn Văn Khánh', CAST(N'1997-03-12' AS Date), 123000005, NULL)
GO
INSERT [dbo].[LOAIPHUKIEN] ([MaLoaiPK], [TenLoaiPK]) VALUES (N'BocVoLang', N'Bọc vô lăng cho xe')
INSERT [dbo].[LOAIPHUKIEN] ([MaLoaiPK], [TenLoaiPK]) VALUES (N'GoiTua', N'Gối tựa đầu cho xe')
INSERT [dbo].[LOAIPHUKIEN] ([MaLoaiPK], [TenLoaiPK]) VALUES (N'TamChe', N'Tấm che nắng cho xe')
GO
INSERT [dbo].[LOAIXE] ([MaLoaiXe], [TenLoaiXe]) VALUES (N'AudiQ504', N'Audi Q5 5 chỗ')
INSERT [dbo].[LOAIXE] ([MaLoaiXe], [TenLoaiXe]) VALUES (N'AudiQ707', N'Audi Q7 7 chỗ')
INSERT [dbo].[LOAIXE] ([MaLoaiXe], [TenLoaiXe]) VALUES (N'BMWi802', N'BMW i8 2020 2 chỗ')
INSERT [dbo].[LOAIXE] ([MaLoaiXe], [TenLoaiXe]) VALUES (N'Mazda304', N'Mazda 3 4 chỗ')
INSERT [dbo].[LOAIXE] ([MaLoaiXe], [TenLoaiXe]) VALUES (N'Mazda606', N'Mazda 6 5 chỗ')
INSERT [dbo].[LOAIXE] ([MaLoaiXe], [TenLoaiXe]) VALUES (N'MazdaCX505', N'Mazda CX-5 5 chỗ')
GO
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'BocVoLang01', N'Bọc vô lăng', N'Sẵng sàng', NULL, NULL, N'BocVoLang')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'BocVoLang02', N'Bọc vô lăng', N'Sẵng sàng', NULL, NULL, N'BocVoLang')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'BocVoLang03', N'Bọc vô lăng', N'Sẵng sàng', NULL, NULL, N'BocVoLang')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'BocVoLang04', N'Bọc vô lăng', N'Sẵng sàng', NULL, NULL, N'BocVoLang')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'BocVoLang05', N'Bọc vô lăng', N'Sẵng sàng', NULL, NULL, N'BocVoLang')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'GoiTua01', N'Gối tựa đầu', N'Sẵng sàng', NULL, NULL, N'GoiTua')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'GoiTua02', N'Gối tựa đầu', N'Sẵng sàng', NULL, NULL, N'GoiTua')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'GoiTua03', N'Gối tựa đầu', N'Sẵng sàng', NULL, NULL, N'GoiTua')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'GoiTua04', N'Gối tựa đầu', N'Sẵng sàng', NULL, NULL, N'GoiTua')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'GoiTua05', N'Gối tựa đầu', N'Sẵng sàng', NULL, NULL, N'GoiTua')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'TamChe01', N'Tấm che nắng', N'Sẵng sàng', NULL, NULL, N'TamChe')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'TamChe02', N'Tấm che nắng', N'Sẵng sàng', NULL, NULL, N'TamChe')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'TamChe03', N'Tấm che nắng', N'Sẵng sàng', NULL, NULL, N'TamChe')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'TamChe04', N'Tấm che nắng', N'Sẵng sàng', NULL, NULL, N'TamChe')
INSERT [dbo].[PHUKIEN] ([MaPK], [TenPK], [TinhTrangPK], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiPK]) VALUES (N'TamChe05', N'Tấm che nắng', N'Sẵng sàng', NULL, NULL, N'TamChe')
GO
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'AudiQ505_01', N'Audi Q5', N'SKAUDI01', N'SMAUDI01', 252, N'AUDI', 5, CAST(1000000.00 AS Decimal(18, 2)), CAST(2500000.00 AS Decimal(18, 2)), CAST(60000000.00 AS Decimal(18, 2)), CAST(1000000.00 AS Decimal(18, 2)), N'sẵng sàng', NULL, NULL, N'AudiQ504', N'43-F1 12345')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'AudiQ505_02', N'Audi Q5', N'SKAUDI02', N'SMAUDI02', 252, N'AUDI', 5, CAST(1000000.00 AS Decimal(18, 2)), CAST(2500000.00 AS Decimal(18, 2)), CAST(60000000.00 AS Decimal(18, 2)), CAST(1000000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'AudiQ504', N'43-F1 12321')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'AudiQ505_03', N'Audi Q5', N'SKAUDI03', N'SMAUDI03', 252, N'AUDI', 5, CAST(1000000.00 AS Decimal(18, 2)), CAST(2500000.00 AS Decimal(18, 2)), CAST(60000000.00 AS Decimal(18, 2)), CAST(1000000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'AudiQ504', N'43-F1 12322')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'AudiQ505_04', N'Audi Q5', N'SKAUDI04', N'SMAUDI04', 252, N'AUDI', 5, CAST(1000000.00 AS Decimal(18, 2)), CAST(2500000.00 AS Decimal(18, 2)), CAST(60000000.00 AS Decimal(18, 2)), CAST(1000000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'AudiQ504', N'43-F1 12323')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'AudiQ707_01', N'Audi Q7', N'SKAUDI05', N'SMAUDI07', 333, N'AUDI', 7, CAST(1200000.00 AS Decimal(18, 2)), CAST(2700000.00 AS Decimal(18, 2)), CAST(65000000.00 AS Decimal(18, 2)), CAST(1200000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'AudiQ707', N'43-F1 45611')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'AudiQ707_02', N'Audi Q7', N'SKAUDI06', N'SMAUDI06', 333, N'AUDI', 7, CAST(1200000.00 AS Decimal(18, 2)), CAST(2700000.00 AS Decimal(18, 2)), CAST(65000000.00 AS Decimal(18, 2)), CAST(1200000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'AudiQ707', N'43-F1 45612')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'AudiQ707_03', N'Audi Q7', N'SKAUDI07', N'SMAUDI07', 333, N'AUDI', 7, CAST(1200000.00 AS Decimal(18, 2)), CAST(2700000.00 AS Decimal(18, 2)), CAST(65000000.00 AS Decimal(18, 2)), CAST(1200000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'AudiQ707', N'43-F1 45614')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'BMWi802_01', N'BMW i8 2020', N'SKBMW08', N'SMBMW08', 369, N'BMW', 2, CAST(1300000.00 AS Decimal(18, 2)), CAST(2800000.00 AS Decimal(18, 2)), CAST(68000000.00 AS Decimal(18, 2)), CAST(1300000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'BMWi802', N'43-F1 12343')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'BMWi802_02', N'BMW i8 2020', N'SKBMW09', N'SMBMW09', 369, N'BMW', 2, CAST(1300000.00 AS Decimal(18, 2)), CAST(2800000.00 AS Decimal(18, 2)), CAST(68000000.00 AS Decimal(18, 2)), CAST(1300000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'BMWi802', N'43-F1 12344')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'BMWi802_03', N'BMW i8 2020', N'SKBMW08', N'SMBMW08', 369, N'BMW', 2, CAST(1300000.00 AS Decimal(18, 2)), CAST(2800000.00 AS Decimal(18, 2)), CAST(68000000.00 AS Decimal(18, 2)), CAST(1300000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'BMWi802', N'43-F1 12344')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'Mazda305_01', N'Mazda 3', N'SKMD01', N'SMMD01', 250, N'Mazda', 5, CAST(500000.00 AS Decimal(18, 2)), CAST(800000.00 AS Decimal(18, 2)), CAST(55000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'Mazda304', N'43-F1 00001')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'Mazda305_02', N'Mazda 3', N'SKMD02', N'SMMD02', 250, N'Mazda', 5, CAST(500000.00 AS Decimal(18, 2)), CAST(800000.00 AS Decimal(18, 2)), CAST(55000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'Mazda304', N'43-F1 00002')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'Mazda305_03', N'Mazda 3', N'SKMD03', N'SMMD03', 250, N'Mazda', 5, CAST(500000.00 AS Decimal(18, 2)), CAST(800000.00 AS Decimal(18, 2)), CAST(55000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'Mazda304', N'43-F1 00003')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'Mazda605_01', N'Mazda 6', N'SKMD08', N'SMMD08', 228, N'Mazda', 5, CAST(550000.00 AS Decimal(18, 2)), CAST(850000.00 AS Decimal(18, 2)), CAST(86000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'Mazda606', N'42-F1 00008')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'Mazda605_02', N'Mazda 6', N'SKMD09', N'SMMD09', 228, N'Mazda', 5, CAST(550000.00 AS Decimal(18, 2)), CAST(850000.00 AS Decimal(18, 2)), CAST(86000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'Mazda606', N'42-F1 00009')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'Mazda605_03', N'Mazda 6', N'SKMD10', N'SMMD10', 228, N'Mazda', 5, CAST(550000.00 AS Decimal(18, 2)), CAST(850000.00 AS Decimal(18, 2)), CAST(86000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'Mazda606', N'42-F1 00010')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'Mazda605_04', N'Mazda 6', N'SKMD11', N'SMMD11', 228, N'Mazda', 5, CAST(550000.00 AS Decimal(18, 2)), CAST(850000.00 AS Decimal(18, 2)), CAST(86000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'Mazda606', N'42-F1 00011')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'MazdaCX505_01', N'Mazda CX-5', N'SKMD04', N'SMMD04', 228, N'Mazda', 5, CAST(600000.00 AS Decimal(18, 2)), CAST(900000.00 AS Decimal(18, 2)), CAST(57000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'MazdaCX505', N'43-F1 00004')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'MazdaCX505_02', N'Mazda CX-5', N'SKMD05', N'SMMD05', 228, N'Mazda', 5, CAST(600000.00 AS Decimal(18, 2)), CAST(900000.00 AS Decimal(18, 2)), CAST(57000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'MazdaCX505', N'43-F1 00005')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'MazdaCX505_03', N'Mazda CX-5', N'SKMD06', N'SMMD06', 228, N'Mazda', 5, CAST(600000.00 AS Decimal(18, 2)), CAST(900000.00 AS Decimal(18, 2)), CAST(57000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'MazdaCX505', N'43-F1 00006')
INSERT [dbo].[Xe] ([MaXe], [TenXe], [SoKhung], [SoMay], [MaLuc], [Hang], [SoCho], [GiaThueXeTheoGio], [GiaThueXeTheoNgay], [GiaThueXeTheoThang], [TienPhat], [TinhTrangXe], [ThoiGianBatDauTinhTrang], [ThoiGianKetThucTinhTrang], [MaLoaiXe], [BienSoXe]) VALUES (N'MazdaCX505_04', N'Mazda CX-5', N'SKMD07', N'SMMD07', 228, N'Mazda', 5, CAST(600000.00 AS Decimal(18, 2)), CAST(900000.00 AS Decimal(18, 2)), CAST(57000000.00 AS Decimal(18, 2)), CAST(500000.00 AS Decimal(18, 2)), N'Sẵng sàng', NULL, NULL, N'MazdaCX505', N'43-F1 00007')
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_KHACHHANG] FOREIGN KEY([SoCMND])
REFERENCES [dbo].[KHACHHANG] ([SoCMND])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_KHACHHANG]
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_LOAIXE] FOREIGN KEY([MaLoaiXe])
REFERENCES [dbo].[LOAIXE] ([MaLoaiXe])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_LOAIXE]
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_PHUKIEN] FOREIGN KEY([MaPK])
REFERENCES [dbo].[PHUKIEN] ([MaPK])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_PHUKIEN]
GO
ALTER TABLE [dbo].[HOPDONG]  WITH CHECK ADD  CONSTRAINT [FK_HOPDONG_Tien] FOREIGN KEY([MaThanhToan])
REFERENCES [dbo].[Tien] ([MaThanhToan])
GO
ALTER TABLE [dbo].[HOPDONG] CHECK CONSTRAINT [FK_HOPDONG_Tien]
GO
ALTER TABLE [dbo].[PHUKIEN]  WITH CHECK ADD  CONSTRAINT [FK_PHUKIEN_LOAIPHUKIEN] FOREIGN KEY([MaLoaiPK])
REFERENCES [dbo].[LOAIPHUKIEN] ([MaLoaiPK])
GO
ALTER TABLE [dbo].[PHUKIEN] CHECK CONSTRAINT [FK_PHUKIEN_LOAIPHUKIEN]
GO
ALTER TABLE [dbo].[Xe]  WITH CHECK ADD  CONSTRAINT [FK_Xe_LOAIXE1] FOREIGN KEY([MaLoaiXe])
REFERENCES [dbo].[LOAIXE] ([MaLoaiXe])
GO
ALTER TABLE [dbo].[Xe] CHECK CONSTRAINT [FK_Xe_LOAIXE1]
GO
