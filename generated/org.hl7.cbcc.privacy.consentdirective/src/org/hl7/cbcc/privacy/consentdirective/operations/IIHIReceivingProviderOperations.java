/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.Participant2Operations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>IIHI Receiving Provider</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider#validateIIHIReceivingProviderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider#validateIIHIReceivingProviderTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Type Code P</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider#validateIIHIReceivingProviderTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Type Code</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProvider#validateIIHIReceivingProviderParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IIHIReceivingProviderOperations extends Participant2Operations {
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
	protected IIHIReceivingProviderOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIIHIReceivingProviderTemplateId(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderTemplateId(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IIHI_RECEIVING_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.7')";

	/**
	 * The cached OCL invariant for the '{@link #validateIIHIReceivingProviderTemplateId(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderTemplateId(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_IIHI_RECEIVING_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param iihiReceivingProvider The receiving '<em><b>IIHI Receiving Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIIHIReceivingProviderTemplateId(IIHIReceivingProvider iihiReceivingProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IIHI_RECEIVING_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.IIHI_RECEIVING_PROVIDER);
			try {
				VALIDATE_IIHI_RECEIVING_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IIHI_RECEIVING_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IIHI_RECEIVING_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				iihiReceivingProvider)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"IIHIReceivingProviderIIHIReceivingProviderTemplateId"),
						new Object[] { iihiReceivingProvider }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIIHIReceivingProviderTypeCodeP(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Type Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderTypeCodeP(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateIIHIReceivingProviderTypeCodeP(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Type Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderTypeCodeP(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param iihiReceivingProvider The receiving '<em><b>IIHI Receiving Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIIHIReceivingProviderTypeCodeP(IIHIReceivingProvider iihiReceivingProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.IIHI_RECEIVING_PROVIDER);
			try {
				VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				iihiReceivingProvider)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_TYPE_CODE_P,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"IIHIReceivingProviderIIHIReceivingProviderTypeCodeP"),
						new Object[] { iihiReceivingProvider }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProviderTypeCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProviderTypeCodeP", passToken);
				}
				passToken.add(iihiReceivingProvider);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIIHIReceivingProviderTypeCode(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderTypeCode(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeCode.oclIsUndefined() and self.typeCode.oclIsKindOf(vocab::ParticipationType) and " +
			"let value : vocab::ParticipationType = self.typeCode.oclAsType(vocab::ParticipationType) in " +
			"value = vocab::ParticipationType::IRCP";

	/**
	 * The cached OCL invariant for the '{@link #validateIIHIReceivingProviderTypeCode(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderTypeCode(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param iihiReceivingProvider The receiving '<em><b>IIHI Receiving Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIIHIReceivingProviderTypeCode(IIHIReceivingProvider iihiReceivingProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.hl7.cbcc.privacy.consentdirective.IIHIReceivingProviderTypeCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(iihiReceivingProvider)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.IIHI_RECEIVING_PROVIDER);
			try {
				VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IIHI_RECEIVING_PROVIDER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				iihiReceivingProvider)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_TYPE_CODE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("IIHIReceivingProviderIIHIReceivingProviderTypeCode"),
						new Object[] { iihiReceivingProvider }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIIHIReceivingProviderParticipantRole(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Participant Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderParticipantRole(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role))";

	/**
	 * The cached OCL invariant for the '{@link #validateIIHIReceivingProviderParticipantRole(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IIHI Receiving Provider Participant Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIIHIReceivingProviderParticipantRole(IIHIReceivingProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param iihiReceivingProvider The receiving '<em><b>IIHI Receiving Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIIHIReceivingProviderParticipantRole(IIHIReceivingProvider iihiReceivingProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.IIHI_RECEIVING_PROVIDER);
			try {
				VALIDATE_IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				iihiReceivingProvider)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.IIHI_RECEIVING_PROVIDER__IIHI_RECEIVING_PROVIDER_PARTICIPANT_ROLE,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString(
							"IIHIReceivingProviderIIHIReceivingProviderParticipantRole"),
						new Object[] { iihiReceivingProvider }));
			}

			return false;
		}
		return true;
	}

} // IIHIReceivingProviderOperations
