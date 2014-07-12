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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Location Latitude</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude#validateDispatchLocationLatitudeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude#validateDispatchLocationLatitudeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude#validateDispatchLocationLatitudeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLatitude#validateDispatchLocationLatitudeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DispatchLocationLatitudeOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchLocationLatitudeOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationLatitudeTemplateId(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeTemplateId(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_LATITUDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.151')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationLatitudeTemplateId(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeTemplateId(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISPATCH_LOCATION_LATITUDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationLatitude The receiving '<em><b>Dispatch Location Latitude</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationLatitudeTemplateId(DispatchLocationLatitude dispatchLocationLatitude,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_LOCATION_LATITUDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_LATITUDE);
			try {
				VALIDATE_DISPATCH_LOCATION_LATITUDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_LOCATION_LATITUDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_LOCATION_LATITUDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchLocationLatitude)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_LOCATION_LATITUDE__DISPATCH_LOCATION_LATITUDE_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("DispatchLocationLatitudeTemplateId"),
					new Object[] { dispatchLocationLatitude }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationLatitudeMoodCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeMoodCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_LATITUDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationLatitudeMoodCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeMoodCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISPATCH_LOCATION_LATITUDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationLatitude The receiving '<em><b>Dispatch Location Latitude</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationLatitudeMoodCode(DispatchLocationLatitude dispatchLocationLatitude,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_LOCATION_LATITUDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_LATITUDE);
			try {
				VALIDATE_DISPATCH_LOCATION_LATITUDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_LOCATION_LATITUDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_LOCATION_LATITUDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchLocationLatitude)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_LOCATION_LATITUDE__DISPATCH_LOCATION_LATITUDE_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("DispatchLocationLatitudeMoodCode"),
					new Object[] { dispatchLocationLatitude }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationLatitudeCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_LATITUDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '52002-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationLatitudeCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeCode(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISPATCH_LOCATION_LATITUDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationLatitude The receiving '<em><b>Dispatch Location Latitude</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationLatitudeCode(DispatchLocationLatitude dispatchLocationLatitude,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_LOCATION_LATITUDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_LATITUDE);
			try {
				VALIDATE_DISPATCH_LOCATION_LATITUDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_LOCATION_LATITUDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_LOCATION_LATITUDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchLocationLatitude)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_LOCATION_LATITUDE__DISPATCH_LOCATION_LATITUDE_CODE,
					EmspcrPlugin.INSTANCE.getString("DispatchLocationLatitudeCode"),
					new Object[] { dispatchLocationLatitude }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDispatchLocationLatitudeValue(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeValue(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPATCH_LOCATION_LATITUDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDispatchLocationLatitudeValue(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Latitude Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDispatchLocationLatitudeValue(DispatchLocationLatitude, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_DISPATCH_LOCATION_LATITUDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dispatchLocationLatitude The receiving '<em><b>Dispatch Location Latitude</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDispatchLocationLatitudeValue(DispatchLocationLatitude dispatchLocationLatitude,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISPATCH_LOCATION_LATITUDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.DISPATCH_LOCATION_LATITUDE);
			try {
				VALIDATE_DISPATCH_LOCATION_LATITUDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPATCH_LOCATION_LATITUDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPATCH_LOCATION_LATITUDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dispatchLocationLatitude)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.DISPATCH_LOCATION_LATITUDE__DISPATCH_LOCATION_LATITUDE_VALUE,
					EmspcrPlugin.INSTANCE.getString("DispatchLocationLatitudeValue"),
					new Object[] { dispatchLocationLatitude }));
			}

			return false;
		}
		return true;
	}

} // DispatchLocationLatitudeOperations
