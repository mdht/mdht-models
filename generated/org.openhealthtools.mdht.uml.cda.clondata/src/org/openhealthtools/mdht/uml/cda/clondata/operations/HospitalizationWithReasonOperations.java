/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;
import org.openhealthtools.mdht.uml.cda.consol.Indication;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospitalization With Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason#validateHospitalizationWithReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason#validateHospitalizationWithReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason#validateHospitalizationWithReasonIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason#getIndication() <em>Get Indication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalizationWithReasonOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalizationWithReasonOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalizationWithReasonTemplateId(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalizationWithReasonTemplateId(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITALIZATION_WITH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.36')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalizationWithReasonTemplateId(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalizationWithReasonTemplateId(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITALIZATION_WITH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalizationWithReason The receiving '<em><b>Hospitalization With Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalizationWithReasonTemplateId(
			HospitalizationWithReason hospitalizationWithReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITALIZATION_WITH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getHospitalizationWithReason());
			try {
				VALIDATE_HOSPITALIZATION_WITH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITALIZATION_WITH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITALIZATION_WITH_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalizationWithReason)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.HOSPITALIZATION_WITH_REASON__HOSPITALIZATION_WITH_REASON_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"HospitalizationWithReasonHospitalizationWithReasonTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										hospitalizationWithReason, context) }),
						new Object[] { hospitalizationWithReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalizationWithReasonCode(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalizationWithReasonCode(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITALIZATION_WITH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " + "value.code = 'IMP')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalizationWithReasonCode(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalizationWithReasonCode(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITALIZATION_WITH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalizationWithReason The receiving '<em><b>Hospitalization With Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalizationWithReasonCode(HospitalizationWithReason hospitalizationWithReason,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITALIZATION_WITH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getHospitalizationWithReason());
			try {
				VALIDATE_HOSPITALIZATION_WITH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HOSPITALIZATION_WITH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITALIZATION_WITH_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalizationWithReason)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.HOSPITALIZATION_WITH_REASON__HOSPITALIZATION_WITH_REASON_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"HospitalizationWithReasonHospitalizationWithReasonCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										hospitalizationWithReason, context) }),
						new Object[] { hospitalizationWithReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalizationWithReasonIndication(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalizationWithReasonIndication(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITALIZATION_WITH_REASON_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalizationWithReasonIndication(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospitalization With Reason Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalizationWithReasonIndication(HospitalizationWithReason, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HOSPITALIZATION_WITH_REASON_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalizationWithReason The receiving '<em><b>Hospitalization With Reason</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalizationWithReasonIndication(
			HospitalizationWithReason hospitalizationWithReason, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITALIZATION_WITH_REASON_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getHospitalizationWithReason());
			try {
				VALIDATE_HOSPITALIZATION_WITH_REASON_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITALIZATION_WITH_REASON_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITALIZATION_WITH_REASON_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalizationWithReason)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.HOSPITALIZATION_WITH_REASON__HOSPITALIZATION_WITH_REASON_INDICATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"HospitalizationWithReasonHospitalizationWithReasonIndication",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										hospitalizationWithReason, context) }),
						new Object[] { hospitalizationWithReason }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIndication(HospitalizationWithReason) <em>Get Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication(HospitalizationWithReason)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INDICATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication))->asSequence()->any(true).oclAsType(consol::Indication)";

	/**
	 * The cached OCL query for the '{@link #getIndication(HospitalizationWithReason) <em>Get Indication</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndication(HospitalizationWithReason)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INDICATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Indication getIndication(HospitalizationWithReason hospitalizationWithReason) {

		if (GET_INDICATION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CLONDATAPackage.eINSTANCE.getHospitalizationWithReason(),
				CLONDATAPackage.eINSTANCE.getHospitalizationWithReason().getEAllOperations().get(54));
			try {
				GET_INDICATION__EOCL_QRY = helper.createQuery(GET_INDICATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_INDICATION__EOCL_QRY);
		return (Indication) query.evaluate(hospitalizationWithReason);
	}

} // HospitalizationWithReasonOperations
