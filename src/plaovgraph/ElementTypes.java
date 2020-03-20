/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package plaovgraph;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see plaovgraph.PlaovgraphPackage#getElementTypes()
 * @model
 * @generated
 */
public enum ElementTypes implements Enumerator {
	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(0, "task", "task"),

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(1, "goal", "goal"),

	/**
	 * The '<em><b>Softgoal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTGOAL(2, "softgoal", "softgoal"),

	/**
	 * The '<em><b>Task ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_REF_VALUE
	 * @generated
	 * @ordered
	 */
	TASK_REF(3, "task_ref", "task_ref"),

	/**
	 * The '<em><b>Goal ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_REF_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL_REF(4, "goal_ref", "goal_ref"),

	/**
	 * The '<em><b>Softgoal ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL_REF_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTGOAL_REF(5, "softgoal_ref", "softgoal_ref");

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Task</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model name="task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 0;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL
	 * @model name="goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 1;

	/**
	 * The '<em><b>Softgoal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Softgoal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL
	 * @model name="softgoal"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTGOAL_VALUE = 2;

	/**
	 * The '<em><b>Task ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Task ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK_REF
	 * @model name="task_ref"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_REF_VALUE = 3;

	/**
	 * The '<em><b>Goal ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goal ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL_REF
	 * @model name="goal_ref"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_REF_VALUE = 4;

	/**
	 * The '<em><b>Softgoal ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Softgoal ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTGOAL_REF
	 * @model name="softgoal_ref"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTGOAL_REF_VALUE = 5;

	/**
	 * An array of all the '<em><b>Element Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ElementTypes[] VALUES_ARRAY =
		new ElementTypes[] {
			TASK,
			GOAL,
			SOFTGOAL,
			TASK_REF,
			GOAL_REF,
			SOFTGOAL_REF,
		};

	/**
	 * A public read-only list of all the '<em><b>Element Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementTypes get(int value) {
		switch (value) {
			case TASK_VALUE: return TASK;
			case GOAL_VALUE: return GOAL;
			case SOFTGOAL_VALUE: return SOFTGOAL;
			case TASK_REF_VALUE: return TASK_REF;
			case GOAL_REF_VALUE: return GOAL_REF;
			case SOFTGOAL_REF_VALUE: return SOFTGOAL_REF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ElementTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ElementTypes
