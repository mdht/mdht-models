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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Return Of Spontaneous Circulation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnOfSpontaneousCirculationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnOfSpontaneousCirculationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReturnOfSpontaneousCirculationTemplateId(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationTemplateId(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.128')";

	/**
	 * The cached OCL invariant for the '{@link #validateReturnOfSpontaneousCirculationTemplateId(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationTemplateId(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param returnOfSpontaneousCirculation The receiving '<em><b>Return Of Spontaneous Circulation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReturnOfSpontaneousCirculationTemplateId(
			ReturnOfSpontaneousCirculation returnOfSpontaneousCirculation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RETURN_OF_SPONTANEOUS_CIRCULATION);
			try {
				VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			returnOfSpontaneousCirculation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RETURN_OF_SPONTANEOUS_CIRCULATION__RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ReturnOfSpontaneousCirculationTemplateId"),
					new Object[] { returnOfSpontaneousCirculation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReturnOfSpontaneousCirculationMoodCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationMoodCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateReturnOfSpontaneousCirculationMoodCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationMoodCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param returnOfSpontaneousCirculation The receiving '<em><b>Return Of Spontaneous Circulation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReturnOfSpontaneousCirculationMoodCode(
			ReturnOfSpontaneousCirculation returnOfSpontaneousCirculation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RETURN_OF_SPONTANEOUS_CIRCULATION);
			try {
				VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			returnOfSpontaneousCirculation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RETURN_OF_SPONTANEOUS_CIRCULATION__RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ReturnOfSpontaneousCirculationMoodCode"),
					new Object[] { returnOfSpontaneousCirculation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReturnOfSpontaneousCirculationCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67513-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateReturnOfSpontaneousCirculationCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationCode(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param returnOfSpontaneousCirculation The receiving '<em><b>Return Of Spontaneous Circulation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReturnOfSpontaneousCirculationCode(
			ReturnOfSpontaneousCirculation returnOfSpontaneousCirculation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RETURN_OF_SPONTANEOUS_CIRCULATION);
			try {
				VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			returnOfSpontaneousCirculation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RETURN_OF_SPONTANEOUS_CIRCULATION__RETURN_OF_SPONTANEOUS_CIRCULATION_CODE,
					EmspcrPlugin.INSTANCE.getString("ReturnOfSpontaneousCirculationCode"),
					new Object[] { returnOfSpontaneousCirculation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReturnOfSpontaneousCirculationValue(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationValue(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17075-5' or value.code = 'LA17076-3' or value.code = 'LA17077-1' or value.code = 'LA32-8')))";

	/**
	 * The cached OCL invariant for the '{@link #validateReturnOfSpontaneousCirculationValue(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationValue(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param returnOfSpontaneousCirculation The receiving '<em><b>Return Of Spontaneous Circulation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReturnOfSpontaneousCirculationValue(
			ReturnOfSpontaneousCirculation returnOfSpontaneousCirculation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RETURN_OF_SPONTANEOUS_CIRCULATION);
			try {
				VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			returnOfSpontaneousCirculation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RETURN_OF_SPONTANEOUS_CIRCULATION__RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE,
					EmspcrPlugin.INSTANCE.getString("ReturnOfSpontaneousCirculationValue"),
					new Object[] { returnOfSpontaneousCirculation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateReturnOfSpontaneousCirculationValueP(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationValueP(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateReturnOfSpontaneousCirculationValueP(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateReturnOfSpontaneousCirculationValueP(ReturnOfSpontaneousCirculation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param returnOfSpontaneousCirculation The receiving '<em><b>Return Of Spontaneous Circulation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateReturnOfSpontaneousCirculationValueP(
			ReturnOfSpontaneousCirculation returnOfSpontaneousCirculation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.RETURN_OF_SPONTANEOUS_CIRCULATION);
			try {
				VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			returnOfSpontaneousCirculation)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.RETURN_OF_SPONTANEOUS_CIRCULATION__RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("ReturnOfSpontaneousCirculationValueP"),
					new Object[] { returnOfSpontaneousCirculation }));
			}

			return false;
		}
		return true;
	}

} // ReturnOfSpontaneousCirculationOperations
