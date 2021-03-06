package us.myles.ViaVersion.api.minecraft;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Position {
    private Long x;
    private Long y;
    private Long z;
}
