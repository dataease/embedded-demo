// 请求响应参数（不包含data）
export interface Result {
  code: string;
  msg: string;
}

// 请求响应参数（包含data）
export interface ResultData<T = any> extends Result {
  data: T;
}

// 文件上传模块
export namespace Upload {
  export interface ResFileUrl {
    fileUrl: string;
  }
}

// 登录模块
export namespace Login {
  export interface PublicKey {
    public_key: String;
  }
}

//嵌入式对象
export namespace Embedded {
  export interface Token {
    token: string;
  }

  export interface SimulatedToken {
    exp: number,
    token: string;
  }
}
