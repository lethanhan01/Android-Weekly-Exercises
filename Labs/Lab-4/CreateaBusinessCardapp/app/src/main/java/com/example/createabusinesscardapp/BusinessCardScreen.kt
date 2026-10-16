package com.example.createabusinesscardapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.createabusinesscardapp.ui.theme.AccentGreen
import com.example.createabusinesscardapp.ui.theme.CardBackground
import com.example.createabusinesscardapp.ui.theme.CreateABusinessCardAppTheme
import com.example.createabusinesscardapp.ui.theme.LogoBackground
import com.example.createabusinesscardapp.ui.theme.NameColor

/**
 * Toàn bộ màn hình Danh thiếp (Business Card Screen).
 * Cung cấp các tham số có giá trị mặc định lấy từ tệp tài nguyên strings.xml.
 */
@Composable
fun BusinessCardApp(
    modifier: Modifier = Modifier,
    fullName: String = stringResource(R.string.full_name),
    jobTitle: String = stringResource(R.string.job_title),
    phoneNumber: String = stringResource(R.string.phone_number),
    socialHandle: String = stringResource(R.string.social_handle),
    email: String = stringResource(R.string.email_address)
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(CardBackground)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))

        ProfileSection(
            fullName = fullName,
            jobTitle = jobTitle
        )

        Spacer(modifier = Modifier.weight(1f))

        ContactSection(
            phoneNumber = phoneNumber,
            socialHandle = socialHandle,
            email = email,
            modifier = Modifier.padding(bottom = 36.dp)
        )
    }
}

/**
 * Khu vực hiển thị thông tin chính bao gồm Logo Android, Họ tên và Chức danh.
 */
@Composable
fun ProfileSection(
    fullName: String,
    jobTitle: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .background(LogoBackground),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = stringResource(id = R.string.desc_android_logo),
                modifier = Modifier.size(100.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = fullName,
            fontSize = 38.sp,
            fontWeight = FontWeight.Light,
            color = NameColor
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = jobTitle,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = AccentGreen
        )
    }
}

/**
 * Khu vực hiển thị các thông tin liên hệ (Điện thoại, Kênh mạng xã hội, Email).
 */
@Composable
fun ContactSection(
    phoneNumber: String,
    socialHandle: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ContactRow(
            icon = Icons.Default.Phone,
            text = phoneNumber,
            contentDescription = stringResource(R.string.desc_phone_icon)
        )
        ContactRow(
            icon = Icons.Default.Share,
            text = socialHandle,
            contentDescription = stringResource(R.string.desc_share_icon)
        )
        ContactRow(
            icon = Icons.Default.Email,
            text = email,
            contentDescription = stringResource(R.string.desc_email_icon)
        )
    }
}

/**
 * Hàng hiển thị một thông tin liên hệ cụ thể gồm một biểu tượng và văn bản đi kèm.
 */
@Composable
fun ContactRow(
    icon: ImageVector,
    text: String,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = AccentGreen,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(24.dp))
        Text(
            text = text,
            fontSize = 15.sp,
            color = NameColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    CreateABusinessCardAppTheme {
        BusinessCardApp()
    }
}
