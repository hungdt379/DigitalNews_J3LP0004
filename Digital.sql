USE [master]
GO
/****** Object:  Database [Digital]    Script Date: 3/24/2020 8:54:58 AM ******/
CREATE DATABASE [Digital]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Digital', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Digital.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'Digital_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SQLEXPRESS\MSSQL\DATA\Digital_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [Digital] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Digital].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Digital] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Digital] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Digital] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Digital] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Digital] SET ARITHABORT OFF 
GO
ALTER DATABASE [Digital] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [Digital] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Digital] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Digital] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Digital] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Digital] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Digital] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Digital] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Digital] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Digital] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Digital] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Digital] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Digital] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Digital] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Digital] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Digital] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Digital] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Digital] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [Digital] SET  MULTI_USER 
GO
ALTER DATABASE [Digital] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Digital] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Digital] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Digital] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [Digital] SET DELAYED_DURABILITY = DISABLED 
GO
USE [Digital]
GO
/****** Object:  Table [dbo].[Digital]    Script Date: 3/24/2020 8:54:58 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Digital](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](50) NOT NULL,
	[description] [text] NOT NULL,
	[image] [nvarchar](50) NOT NULL,
	[author] [nvarchar](50) NOT NULL,
	[timePost] [date] NOT NULL,
	[shortDes] [text] NOT NULL,
 CONSTRAINT [PK_News] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Digital] ON 

INSERT [dbo].[Digital] ([ID], [title], [description], [image], [author], [timePost], [shortDes]) VALUES (1, N'The First New Digital', N'A study conducted by researchers at the ISI Foundation in Italy have found that hits on Wikipedia pages related to specific diseases may be closely synchronised with media coverage of the same diseases.

During outbreaks of a newly emerging infection, such as the current coronavirus pandemic, media outlets play a leading role in communicating risks and the ways in which people can protect themselves.

Previously, researchers have investigated how the public responds to media coverage during the early stages of disease outbreaks, although this marks the first such study based on observational data rather than surveys.

In this study, Michele Tizzoni and his colleagues looked specifically at the relationship between media coverage and public attention to the 2015-16 Zika epidemic. The epidemic, which was caused by the mosquito borne Zika virus, spread from the Americas to several Pacific Islands and parts of Southeast Asia, resulting in birth defects such as microcephaly.

Tizzoni analysed the number of times that people in the US accessed Wikipedia pages related to Zika in 2016 and compared those data with Zika incidence rates and media coverage of the outbreak.', N'i1.jpg', N'E&T editorial staff', CAST(N'2019-10-09' AS Date), N'A study conducted by researchers at the ISI Foundation in Italy have found that hits on Wikipedia pages related to specific diseases may be closely synchronised with media coverage of the same diseases.')
INSERT [dbo].[Digital] ([ID], [title], [description], [image], [author], [timePost], [shortDes]) VALUES (2, N'The Second New Digital', N'Electric car batteries could be damaged from commercial fast-charging stations which subject them to high temperatures and high resistance, potentially causing them to crack, leak and lose storage capacity.

Engineers at the University of California, Riverside are developing a method to remedy the problem by charging at lower temperatures, which has shown to lower the risk of catastrophic damage and loss of storage capacity.

The researchers charged one set of discharged Panasonic NCR 18650B cylindrical lithium-ion batteries, such as those found in Tesla cars, using the same industry fast-charging method as the fast chargers typically found along US freeways.

They also charged a set of batteries using a new fast-charging algorithm based on the battery’s internal resistance, which interferes with the flow of electrons.

The internal resistance of a battery fluctuates according to temperature, charge state, battery age, and other factors. High internal resistance can cause problems during charging.

', N'i1.jpg', N'Christoper Robin', CAST(N'2019-10-11' AS Date), N'Electric car batteries could be damaged from commercial fast-charging stations which subject them to high temperatures and high resistance, potentially causing them to crack, leak and lose storage capacity.')
INSERT [dbo].[Digital] ([ID], [title], [description], [image], [author], [timePost], [shortDes]) VALUES (3, N'The Third New Digital', N'A study conducted by researchers at the ISI Foundation in Italy have found that hits on Wikipedia pages related to specific diseases may be closely synchronised with media coverage of the same diseases.

During outbreaks of a newly emerging infection, such as the current coronavirus pandemic, media outlets play a leading role in communicating risks and the ways in which people can protect themselves.

Previously, researchers have investigated how the public responds to media coverage during the early stages of disease outbreaks, although this marks the first such study based on observational data rather than surveys.

In this study, Michele Tizzoni and his colleagues looked specifically at the relationship between media coverage and public attention to the 2015-16 Zika epidemic. The epidemic, which was caused by the mosquito borne Zika virus, spread from the Americas to several Pacific Islands and parts of Southeast Asia, resulting in birth defects such as microcephaly.

Tizzoni analysed the number of times that people in the US accessed Wikipedia pages related to Zika in 2016 and compared those data with Zika incidence rates and media coverage of the outbreak.', N'i1.jpg', N'E&T', CAST(N'2019-10-11' AS Date), N'A study conducted by researchers at the ISI Foundation in Italy have found that hits on Wikipedia pages related to specific diseases may be closely synchronised with media coverage of the same diseases.')
INSERT [dbo].[Digital] ([ID], [title], [description], [image], [author], [timePost], [shortDes]) VALUES (4, N'The Fourth New Digital', N'Electric car batteries could be damaged from commercial fast-charging stations which subject them to high temperatures and high resistance, potentially causing them to crack, leak and lose storage capacity.

Engineers at the University of California, Riverside are developing a method to remedy the problem by charging at lower temperatures, which has shown to lower the risk of catastrophic damage and loss of storage capacity.

The researchers charged one set of discharged Panasonic NCR 18650B cylindrical lithium-ion batteries, such as those found in Tesla cars, using the same industry fast-charging method as the fast chargers typically found along US freeways.

They also charged a set of batteries using a new fast-charging algorithm based on the battery’s internal resistance, which interferes with the flow of electrons.

The internal resistance of a battery fluctuates according to temperature, charge state, battery age, and other factors. High internal resistance can cause problems during charging.

', N'i1.jpg', N'Hevalukeee', CAST(N'2019-11-11' AS Date), N'Electric car batteries could be damaged from commercial fast-charging stations which subject them to high temperatures and high resistance, potentially causing them to crack, leak and lose storage capacity.')
INSERT [dbo].[Digital] ([ID], [title], [description], [image], [author], [timePost], [shortDes]) VALUES (5, N'The Fifth New Digital', N'A study conducted by researchers at the ISI Foundation in Italy have found that hits on Wikipedia pages related to specific diseases may be closely synchronised with media coverage of the same diseases.

During outbreaks of a newly emerging infection, such as the current coronavirus pandemic, media outlets play a leading role in communicating risks and the ways in which people can protect themselves.

Previously, researchers have investigated how the public responds to media coverage during the early stages of disease outbreaks, although this marks the first such study based on observational data rather than surveys.

In this study, Michele Tizzoni and his colleagues looked specifically at the relationship between media coverage and public attention to the 2015-16 Zika epidemic. The epidemic, which was caused by the mosquito borne Zika virus, spread from the Americas to several Pacific Islands and parts of Southeast Asia, resulting in birth defects such as microcephaly.

Tizzoni analysed the number of times that people in the US accessed Wikipedia pages related to Zika in 2016 and compared those data with Zika incidence rates and media coverage of the outbreak.', N'i1.jpg', N'E&T', CAST(N'2019-12-10' AS Date), N'A study conducted by researchers at the ISI Foundation in Italy have found that hits on Wikipedia pages related to specific diseases may be closely synchronised with media coverage of the same diseases.')
INSERT [dbo].[Digital] ([ID], [title], [description], [image], [author], [timePost], [shortDes]) VALUES (6, N'The Sixth New Digital', N'Electric car batteries could be damaged from commercial fast-charging stations which subject them to high temperatures and high resistance, potentially causing them to crack, leak and lose storage capacity.

Engineers at the University of California, Riverside are developing a method to remedy the problem by charging at lower temperatures, which has shown to lower the risk of catastrophic damage and loss of storage capacity.

The researchers charged one set of discharged Panasonic NCR 18650B cylindrical lithium-ion batteries, such as those found in Tesla cars, using the same industry fast-charging method as the fast chargers typically found along US freeways.

They also charged a set of batteries using a new fast-charging algorithm based on the battery’s internal resistance, which interferes with the flow of electrons.

The internal resistance of a battery fluctuates according to temperature, charge state, battery age, and other factors. High internal resistance can cause problems during charging.

', N'i1.jpg', N'ok boy', CAST(N'2019-12-15' AS Date), N'Electric car batteries could be damaged from commercial fast-charging stations which subject them to high temperatures and high resistance, potentially causing them to crack, leak and lose storage capacity.')
INSERT [dbo].[Digital] ([ID], [title], [description], [image], [author], [timePost], [shortDes]) VALUES (7, N'The Seventh New Digital', N'Scientists have created a camera that does not need to be focused by using a single lens that is about one-thousandth of an inch thick.

They believe the technology offers considerable benefits over traditional cameras such as the ones in most smartphones, which require multiple lenses to form high-quality, in-focus images.

“Our flat lenses can drastically reduce the weight, complexity and cost of cameras and other imaging systems, while increasing their functionality,” said research team leader Rajesh Menon from the University of Utah.

“Such optics could enable thinner smartphone cameras, improved and smaller cameras for biomedical imaging such as endoscopy, and more compact cameras for automobiles.”', N'i1.jpg', N'tttttttttttttt', CAST(N'2020-01-21' AS Date), N'Scientists have created a camera that does not need to be focused by using a single lens that is about one-thousandth of an inch thick.')
SET IDENTITY_INSERT [dbo].[Digital] OFF
USE [master]
GO
ALTER DATABASE [Digital] SET  READ_WRITE 
GO
