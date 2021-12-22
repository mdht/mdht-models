/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignObservation2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Organizer2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2CDTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizer2CDTranslationP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#getConsolVitalSignObservation2s() <em>Get Consol Vital Sign Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizer2#validateVitalSignsOrganizerVitalSignObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Vital Sign Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsOrganizer2Operations extends VitalSignsOrganizerOperations {
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
	protected VitalSignsOrganizer2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizer2TemplateId(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2TemplateId(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.26' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizer2TemplateId(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2TemplateId(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizer2TemplateId(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizer2TemplateId", "ERROR");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizer2TemplateId"),
						new Object[] { vitalSignsOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerCodeP(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizerCodeP", "ERROR");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vitalSignsOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER_CODE_P,
						ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizerCodeP"),
						new Object[] { vitalSignsOrganizer2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizerCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizerCodeP", passToken);
				}
				passToken.add(vitalSignsOrganizer2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizer2AuthorParticipation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2AuthorParticipation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizer2AuthorParticipation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2AuthorParticipation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizer2AuthorParticipation(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizer2AuthorParticipation", "WARNING");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER2_AUTHOR_PARTICIPATION,
						ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizer2AuthorParticipation"),
						new Object[] { vitalSignsOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizer2CDTranslation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2CDTranslation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.code = '74728-7' and value.codeSystem = '2.16.840.1.113883.6.1')) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizer2CDTranslation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2CDTranslation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateVitalSignsOrganizer2CDTranslation(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizer2CDTranslation", "ERROR");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			vitalSignsOrganizer2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION,
							ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizer2CDTranslation"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizer2CDTranslationP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2CDTranslationP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() =  1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizer2CDTranslationP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer2 CD Translation P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizer2CDTranslationP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateVitalSignsOrganizer2CDTranslationP(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizer2CDTranslationP", "ERROR");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			vitalSignsOrganizer2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER2_CD_TRANSLATION_P,
							ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizer2CDTranslationP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolVitalSignObservation2s(VitalSignsOrganizer2) <em>Get Consol Vital Sign Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolVitalSignObservation2s(VitalSignsOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_VITAL_SIGN_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::VitalSignObservation2)).oclAsType(consol::VitalSignObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolVitalSignObservation2s(VitalSignsOrganizer2) <em>Get Consol Vital Sign Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolVitalSignObservation2s(VitalSignsOrganizer2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_VITAL_SIGN_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<VitalSignObservation2> getConsolVitalSignObservation2s(
			VitalSignsOrganizer2 vitalSignsOrganizer2) {

		if (GET_CONSOL_VITAL_SIGN_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2,
				ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2.getEAllOperations().get(67));
			try {
				GET_CONSOL_VITAL_SIGN_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_VITAL_SIGN_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_VITAL_SIGN_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSignObservation2> result = (Collection<VitalSignObservation2>) query.evaluate(
			vitalSignsOrganizer2);
		return new BasicEList.UnmodifiableEList<VitalSignObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerCodeP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerCodeP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerCodeP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerCodeP(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerCode(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerCode(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '46680005' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerCode(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerCode(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerCode(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.VitalSignsOrganizerCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(vitalSignsOrganizer2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizerCode", "ERROR");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vitalSignsOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER_CODE,
						ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizerCode"),
						new Object[] { vitalSignsOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerEffectiveTime(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizerEffectiveTime", "ERROR");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizerEffectiveTime"),
						new Object[] { vitalSignsOrganizer2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Vital Sign Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(consol::VitalSignObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Organizer Vital Sign Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsOrganizer2 The receiving '<em><b>Vital Signs Organizer2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateVitalSignsOrganizerVitalSignObservation(VitalSignsOrganizer2 vitalSignsOrganizer2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "VitalSignsOrganizer2VitalSignsOrganizerVitalSignObservation", "ERROR");

		if (VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.VITAL_SIGNS_ORGANIZER2);
			try {
				VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsOrganizer2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.VITAL_SIGNS_ORGANIZER2__VITAL_SIGNS_ORGANIZER_VITAL_SIGN_OBSERVATION,
						ConsolPlugin.INSTANCE.getString("VitalSignsOrganizer2VitalSignsOrganizerVitalSignObservation"),
						new Object[] { vitalSignsOrganizer2 }));
			}

			return false;
		}
		return true;
	}

} // VitalSignsOrganizer2Operations
