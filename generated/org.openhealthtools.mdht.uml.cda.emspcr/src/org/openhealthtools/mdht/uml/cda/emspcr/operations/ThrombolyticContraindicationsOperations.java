/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Thrombolytic Contraindications</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindications#validateThrombolyticContraindicationsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThrombolyticContraindicationsOperations extends ClinicalStatementOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ThrombolyticContraindicationsOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateThrombolyticContraindicationsTemplateId(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsTemplateId(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.82')";

	/**
	* The cached OCL invariant for the '{@link #validateThrombolyticContraindicationsTemplateId(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsTemplateId(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param thrombolyticContraindications The receiving '<em><b>Thrombolytic Contraindications</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateThrombolyticContraindicationsTemplateId(
			ThrombolyticContraindications thrombolyticContraindications, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.THROMBOLYTIC_CONTRAINDICATIONS);
			try {
				VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			thrombolyticContraindications)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.THROMBOLYTIC_CONTRAINDICATIONS__THROMBOLYTIC_CONTRAINDICATIONS_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("ThrombolyticContraindicationsTemplateId"),
					new Object[] { thrombolyticContraindications }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateThrombolyticContraindicationsCodeP(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsCodeP(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateThrombolyticContraindicationsCodeP(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsCodeP(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param thrombolyticContraindications The receiving '<em><b>Thrombolytic Contraindications</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateThrombolyticContraindicationsCodeP(
			ThrombolyticContraindications thrombolyticContraindications, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.THROMBOLYTIC_CONTRAINDICATIONS);
			try {
				VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			thrombolyticContraindications)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.THROMBOLYTIC_CONTRAINDICATIONS__THROMBOLYTIC_CONTRAINDICATIONS_CODE_P,
					EmspcrPlugin.INSTANCE.getString("ThrombolyticContraindicationsCodeP"),
					new Object[] { thrombolyticContraindications }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindicationsCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindicationsCodeP", passToken);
				}
				passToken.add(thrombolyticContraindications);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateThrombolyticContraindicationsCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67523-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateThrombolyticContraindicationsCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param thrombolyticContraindications The receiving '<em><b>Thrombolytic Contraindications</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateThrombolyticContraindicationsCode(
			ThrombolyticContraindications thrombolyticContraindications, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.ThrombolyticContraindicationsCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(thrombolyticContraindications)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.THROMBOLYTIC_CONTRAINDICATIONS);
			try {
				VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			thrombolyticContraindications)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.THROMBOLYTIC_CONTRAINDICATIONS__THROMBOLYTIC_CONTRAINDICATIONS_CODE,
					EmspcrPlugin.INSTANCE.getString("ThrombolyticContraindicationsCode"),
					new Object[] { thrombolyticContraindications }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateThrombolyticContraindicationsValue(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Value</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsValue(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17114-2' or value.code = 'LA17115-9' or value.code = 'LA17116-7')))";

	/**
	* The cached OCL invariant for the '{@link #validateThrombolyticContraindicationsValue(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Value</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsValue(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param thrombolyticContraindications The receiving '<em><b>Thrombolytic Contraindications</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateThrombolyticContraindicationsValue(
			ThrombolyticContraindications thrombolyticContraindications, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.THROMBOLYTIC_CONTRAINDICATIONS);
			try {
				VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			thrombolyticContraindications)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.THROMBOLYTIC_CONTRAINDICATIONS__THROMBOLYTIC_CONTRAINDICATIONS_VALUE,
					EmspcrPlugin.INSTANCE.getString("ThrombolyticContraindicationsValue"),
					new Object[] { thrombolyticContraindications }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateThrombolyticContraindicationsMoodCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Mood Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsMoodCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	* The cached OCL invariant for the '{@link #validateThrombolyticContraindicationsMoodCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thrombolytic Contraindications Mood Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateThrombolyticContraindicationsMoodCode(ThrombolyticContraindications, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param thrombolyticContraindications The receiving '<em><b>Thrombolytic Contraindications</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateThrombolyticContraindicationsMoodCode(
			ThrombolyticContraindications thrombolyticContraindications, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.THROMBOLYTIC_CONTRAINDICATIONS);
			try {
				VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			thrombolyticContraindications)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.THROMBOLYTIC_CONTRAINDICATIONS__THROMBOLYTIC_CONTRAINDICATIONS_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("ThrombolyticContraindicationsMoodCode"),
					new Object[] { thrombolyticContraindications }));
			}

			return false;
		}
		return true;
	}

} // ThrombolyticContraindicationsOperations
