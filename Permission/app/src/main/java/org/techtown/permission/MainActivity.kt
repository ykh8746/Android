package org.techtown.permission

import android.Manifest
import android.Manifest.permission.CAMERA
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import org.techtown.permission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        checkPermission()
    }

    fun checkPermission(){
        // 카메라 권한의 승인 상태 가져오기
        val cameraPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)

        if(cameraPermission == PackageManager.PERMISSION_GRANTED){
            startProcess()
            //승인이면 프로그램 진행
        }
        else{
            requestPermission()
            //미승인이면 권한 요청
        }

    }

    fun startProcess(){//프로세스 진행
        Toast.makeText(this, "카메라를 실행합니다", Toast.LENGTH_LONG).show()
    }

    fun requestPermission(){//권한요청
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 99)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode){
            99 -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    startProcess()
                }
                else{
                    finish()
                }
            }
        }
    }
}

