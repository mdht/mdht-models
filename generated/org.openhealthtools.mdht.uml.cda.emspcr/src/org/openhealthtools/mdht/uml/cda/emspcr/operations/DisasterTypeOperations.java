/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.DisasterType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Disaster Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisasterTypeOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DisasterTypeOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateDisasterTypeTemplateId(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeTemplateId(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISASTER_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.59')";

	/**
	* The cached OCL invariant for the '{@link #validateDisasterTypeTemplateId(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeTemplateId(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISASTER_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param disasterType The receiving '<em><b>Disaster Type</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDisasterTypeTemplateId(DisasterType disasterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISASTER_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISASTER_TYPE);
			try {
				VALIDATE_DISASTER_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISASTER_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISASTER_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			disasterType)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISASTER_TYPE__DISASTER_TYPE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("DisasterTypeTemplateId"), new Object[] { disasterType }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDisasterTypeCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISASTER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '69463-8' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateDisasterTypeCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISASTER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param disasterType The receiving '<em><b>Disaster Type</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDisasterTypeCode(DisasterType disasterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISASTER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISASTER_TYPE);
			try {
				VALIDATE_DISASTER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISASTER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISASTER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(disasterType)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISASTER_TYPE__DISASTER_TYPE_CODE,
					EmspcrPlugin.INSTANCE.getString("DisasterTypeCode"), new Object[] { disasterType }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDisasterTypeValue(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeValue(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISASTER_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17594-5' or value.code = 'LA18089-5' or value.code = 'LA18090-3' or value.code = 'LA18091-1' or value.code = 'LA18092-9' or value.code = 'LA18093-7' or value.code = 'LA18094-5' or value.code = 'LA18095-2' or value.code = 'LA18096-0' or value.code = 'LA18097-8' or value.code = 'LA18098-6' or value.code = 'LA18099-4' or value.code = 'LA18100-0' or value.code = 'LA18101-8')))";

	/**
	* The cached OCL invariant for the '{@link #validateDisasterTypeValue(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeValue(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISASTER_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param disasterType The receiving '<em><b>Disaster Type</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDisasterTypeValue(DisasterType disasterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISASTER_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISASTER_TYPE);
			try {
				VALIDATE_DISASTER_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISASTER_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISASTER_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(disasterType)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISASTER_TYPE__DISASTER_TYPE_VALUE,
					EmspcrPlugin.INSTANCE.getString("DisasterTypeValue"), new Object[] { disasterType }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDisasterTypeMoodCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeMoodCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISASTER_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateDisasterTypeMoodCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDisasterTypeMoodCode(DisasterType, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISASTER_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param disasterType The receiving '<em><b>Disaster Type</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDisasterTypeMoodCode(DisasterType disasterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISASTER_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISASTER_TYPE);
			try {
				VALIDATE_DISASTER_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISASTER_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISASTER_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(disasterType)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISASTER_TYPE__DISASTER_TYPE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("DisasterTypeMoodCode"), new Object[] { disasterType }));
			}

			return false;
		}
		return true;
	}

} // DisasterTypeOperations
