USE [Test]
GO
/****** Object:  Table [dbo].[BUser]    Script Date: 2023/7/3 上午 08:42:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BUser](
	[id] [int] NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[username] [nvarchar](50) NULL,
	[phone_number] [nvarchar](50) NULL,
	[registration_time] [nvarchar](50) NULL,
	[last_login_time] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[BUser] ([id], [password], [username], [phone_number], [registration_time], [last_login_time]) VALUES (1, N'123', N'admin', N'0987654321', N'', N'')
GO
