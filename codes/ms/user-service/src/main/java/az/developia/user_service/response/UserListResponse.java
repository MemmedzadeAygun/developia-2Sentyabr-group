package az.developia.user_service.response;

import java.util.List;

import az.developia.user_service.entity.UserEntity;
import lombok.Data;

@Data
public class UserListResponse {

	private List<UserEntity> userResponse;
}
