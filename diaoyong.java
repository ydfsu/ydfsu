            while(True):
                try:
                    lazy_img = driver.find_elements_by_css_selector('img.lazy-img')
                    js = 'document.getElementsByClassName("lazy-img")[0].scrollIntoView();'
                    driver.execute_script(js)
                    time.sleep(3)
                except:
                    # 找不到控件img.lazy-img，所以退出循环
                    break


            break




    # 调用chrome打印功能
    driver.execute_script('window.print();')


    # 调用系统方式自动打开这个pdf文件
    pdf_file_name = '{}.pdf'.format(driver.title)
    print(u'生成完毕，已为你自动打开 {}'.format(pdf_file_name))
    open_pdf_file(pdf_file_name)

    # 退出浏览器
    driver.quit()
