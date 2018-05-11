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
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.CulturalAndReligiousObservation;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusMeaningfulUse2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CulturalAndReligiousObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2CharacteristicsOfHomeEnvironment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySection2BirthSexObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Birth Sex Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getConsolSocialHistoryObservation2s() <em>Get Consol Social History Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getConsolCurrentSmokingStatus2s() <em>Get Consol Current Smoking Status2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getConsolTobaccoUse2s() <em>Get Consol Tobacco Use2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getCulturalAndReligiousObservations() <em>Get Cultural And Religious Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getCharacteristicsOfHomeEnvironments() <em>Get Characteristics Of Home Environments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#getBirthSexObservations() <em>Get Birth Sex Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionSocialHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2#validateSocialHistorySectionTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistorySection2Operations extends SocialHistorySectionOperations {
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
	protected SocialHistorySection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2TemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2TemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.17' and id.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2TemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2TemplateId(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySection2TemplateId(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySection2TemplateId"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2CaregiverCharacteristics(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CaregiverCharacteristics(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CaregiverCharacteristics))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2CaregiverCharacteristics(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Caregiver Characteristics</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CaregiverCharacteristics(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySection2CaregiverCharacteristics(
			SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_CAREGIVER_CHARACTERISTICS,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySection2SocialHistorySection2CaregiverCharacteristics"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2CulturalAndReligiousObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CulturalAndReligiousObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CulturalAndReligiousObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2CulturalAndReligiousObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Cultural And Religious Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CulturalAndReligiousObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySection2CulturalAndReligiousObservation(
			SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_CULTURAL_AND_RELIGIOUS_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySection2SocialHistorySection2CulturalAndReligiousObservation"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2CharacteristicsOfHomeEnvironment(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CharacteristicsOfHomeEnvironment(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2CharacteristicsOfHomeEnvironment(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Characteristics Of Home Environment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2CharacteristicsOfHomeEnvironment(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySection2CharacteristicsOfHomeEnvironment(
			SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_CHARACTERISTICS_OF_HOME_ENVIRONMENT,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySection2SocialHistorySection2CharacteristicsOfHomeEnvironment"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySection2BirthSexObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Birth Sex Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2BirthSexObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION2_BIRTH_SEX_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::BirthSexObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySection2BirthSexObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section2 Birth Sex Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySection2BirthSexObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION2_BIRTH_SEX_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySection2BirthSexObservation(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION2_BIRTH_SEX_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION2_BIRTH_SEX_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION2_BIRTH_SEX_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION2_BIRTH_SEX_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION2_BIRTH_SEX_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySection2SocialHistorySection2BirthSexObservation"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolSocialHistoryObservation2s(SocialHistorySection2) <em>Get Consol Social History Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSocialHistoryObservation2s(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_SOCIAL_HISTORY_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SocialHistoryObservation2)).oclAsType(consol::SocialHistoryObservation2)";

	/**
	 * The cached OCL query for the '{@link #getConsolSocialHistoryObservation2s(SocialHistorySection2) <em>Get Consol Social History Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolSocialHistoryObservation2s(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SocialHistoryObservation2> getConsolSocialHistoryObservation2s(
			SocialHistorySection2 socialHistorySection2) {

		if (GET_CONSOL_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2.getEAllOperations().get(73));
			try {
				GET_CONSOL_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_SOCIAL_HISTORY_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_SOCIAL_HISTORY_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SocialHistoryObservation2> result = (Collection<SocialHistoryObservation2>) query.evaluate(
			socialHistorySection2);
		return new BasicEList.UnmodifiableEList<SocialHistoryObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolCurrentSmokingStatus2s(SocialHistorySection2) <em>Get Consol Current Smoking Status2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCurrentSmokingStatus2s(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_CURRENT_SMOKING_STATUS2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2)).oclAsType(consol::SmokingStatusMeaningfulUse2)";

	/**
	 * The cached OCL query for the '{@link #getConsolCurrentSmokingStatus2s(SocialHistorySection2) <em>Get Consol Current Smoking Status2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolCurrentSmokingStatus2s(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_CURRENT_SMOKING_STATUS2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<SmokingStatusMeaningfulUse2> getConsolCurrentSmokingStatus2s(
			SocialHistorySection2 socialHistorySection2) {

		if (GET_CONSOL_CURRENT_SMOKING_STATUS2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2.getEAllOperations().get(74));
			try {
				GET_CONSOL_CURRENT_SMOKING_STATUS2S__EOCL_QRY = helper.createQuery(
					GET_CONSOL_CURRENT_SMOKING_STATUS2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_CURRENT_SMOKING_STATUS2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SmokingStatusMeaningfulUse2> result = (Collection<SmokingStatusMeaningfulUse2>) query.evaluate(
			socialHistorySection2);
		return new BasicEList.UnmodifiableEList<SmokingStatusMeaningfulUse2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolTobaccoUse2s(SocialHistorySection2) <em>Get Consol Tobacco Use2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolTobaccoUse2s(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_TOBACCO_USE2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::TobaccoUse2)).oclAsType(consol::TobaccoUse2)";

	/**
	 * The cached OCL query for the '{@link #getConsolTobaccoUse2s(SocialHistorySection2) <em>Get Consol Tobacco Use2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolTobaccoUse2s(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_TOBACCO_USE2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<TobaccoUse2> getConsolTobaccoUse2s(SocialHistorySection2 socialHistorySection2) {

		if (GET_CONSOL_TOBACCO_USE2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2.getEAllOperations().get(75));
			try {
				GET_CONSOL_TOBACCO_USE2S__EOCL_QRY = helper.createQuery(GET_CONSOL_TOBACCO_USE2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONSOL_TOBACCO_USE2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<TobaccoUse2> result = (Collection<TobaccoUse2>) query.evaluate(socialHistorySection2);
		return new BasicEList.UnmodifiableEList<TobaccoUse2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCaregiverCharacteristicss(SocialHistorySection2) <em>Get Caregiver Characteristicss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CaregiverCharacteristics)).oclAsType(consol::CaregiverCharacteristics)";

	/**
	 * The cached OCL query for the '{@link #getCaregiverCharacteristicss(SocialHistorySection2) <em>Get Caregiver Characteristicss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaregiverCharacteristicss(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CaregiverCharacteristics> getCaregiverCharacteristicss(
			SocialHistorySection2 socialHistorySection2) {

		if (GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2.getEAllOperations().get(76));
			try {
				GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY = helper.createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CAREGIVER_CHARACTERISTICSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CaregiverCharacteristics> result = (Collection<CaregiverCharacteristics>) query.evaluate(
			socialHistorySection2);
		return new BasicEList.UnmodifiableEList<CaregiverCharacteristics>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCulturalAndReligiousObservations(SocialHistorySection2) <em>Get Cultural And Religious Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCulturalAndReligiousObservations(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CulturalAndReligiousObservation)).oclAsType(consol::CulturalAndReligiousObservation)";

	/**
	 * The cached OCL query for the '{@link #getCulturalAndReligiousObservations(SocialHistorySection2) <em>Get Cultural And Religious Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCulturalAndReligiousObservations(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CulturalAndReligiousObservation> getCulturalAndReligiousObservations(
			SocialHistorySection2 socialHistorySection2) {

		if (GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2.getEAllOperations().get(77));
			try {
				GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(
					GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CULTURAL_AND_RELIGIOUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CulturalAndReligiousObservation> result = (Collection<CulturalAndReligiousObservation>) query.evaluate(
			socialHistorySection2);
		return new BasicEList.UnmodifiableEList<CulturalAndReligiousObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCharacteristicsOfHomeEnvironments(SocialHistorySection2) <em>Get Characteristics Of Home Environments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfHomeEnvironments(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::CharacteristicsOfHomeEnvironment)).oclAsType(consol::CharacteristicsOfHomeEnvironment)";

	/**
	 * The cached OCL query for the '{@link #getCharacteristicsOfHomeEnvironments(SocialHistorySection2) <em>Get Characteristics Of Home Environments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicsOfHomeEnvironments(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CharacteristicsOfHomeEnvironment> getCharacteristicsOfHomeEnvironments(
			SocialHistorySection2 socialHistorySection2) {

		if (GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2.getEAllOperations().get(78));
			try {
				GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY = helper.createQuery(
					GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHARACTERISTICS_OF_HOME_ENVIRONMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CharacteristicsOfHomeEnvironment> result = (Collection<CharacteristicsOfHomeEnvironment>) query.evaluate(
			socialHistorySection2);
		return new BasicEList.UnmodifiableEList<CharacteristicsOfHomeEnvironment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getBirthSexObservations(SocialHistorySection2) <em>Get Birth Sex Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthSexObservations(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BIRTH_SEX_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::BirthSexObservation)).oclAsType(consol::BirthSexObservation)";

	/**
	 * The cached OCL query for the '{@link #getBirthSexObservations(SocialHistorySection2) <em>Get Birth Sex Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthSexObservations(SocialHistorySection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BIRTH_SEX_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<BirthSexObservation> getBirthSexObservations(SocialHistorySection2 socialHistorySection2) {

		if (GET_BIRTH_SEX_OBSERVATIONS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2,
				ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2.getEAllOperations().get(79));
			try {
				GET_BIRTH_SEX_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_BIRTH_SEX_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BIRTH_SEX_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<BirthSexObservation> result = (Collection<BirthSexObservation>) query.evaluate(
			socialHistorySection2);
		return new BasicEList.UnmodifiableEList<BirthSexObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCodeP(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionCodeP(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySectionCodeP"),
						new Object[] { socialHistorySection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP", passToken);
				}
				passToken.add(socialHistorySection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " + "value.code = '29762-2')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionCode(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionCode(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SocialHistorySectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(socialHistorySection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySectionCode"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SocialHistoryObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionSocialHistoryObservation(
			SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySection2SocialHistorySectionSocialHistoryObservation"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::SmokingStatusMeaningfulUse2))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Smoking Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionSmokingStatusObservation(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionSmokingStatusObservation(
			SocialHistorySection2 socialHistorySection2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION,
						ConsolPlugin.INSTANCE.getString(
							"SocialHistorySection2SocialHistorySectionSmokingStatusObservation"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTobaccoUse(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTobaccoUse(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::TobaccoUse2))";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTobaccoUse(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Tobacco Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTobaccoUse(SocialHistorySection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection2 The receiving '<em><b>Social History Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionTobaccoUse(SocialHistorySection2 socialHistorySection2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SOCIAL_HISTORY_SECTION2);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SOCIAL_HISTORY_SECTION_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				socialHistorySection2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.SOCIAL_HISTORY_SECTION2__SOCIAL_HISTORY_SECTION_TOBACCO_USE,
						ConsolPlugin.INSTANCE.getString("SocialHistorySection2SocialHistorySectionTobaccoUse"),
						new Object[] { socialHistorySection2 }));
			}

			return false;
		}
		return true;
	}

} // SocialHistorySection2Operations
