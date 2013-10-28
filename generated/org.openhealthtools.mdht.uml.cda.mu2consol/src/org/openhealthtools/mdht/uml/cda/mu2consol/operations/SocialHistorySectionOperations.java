/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

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
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Social History Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection#validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL Social History Section Smoking Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection#getMu2consolSmokingStatusObservations() <em>Get Mu2consol Smoking Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistorySectionOperations
		extends
		org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL Social History Section Smoking Status Observation</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(mu2consol::SmokingStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL Social History Section Smoking Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMU2CONSOLSocialHistorySectionSmokingStatusObservation(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SOCIAL_HISTORY_SECTION__MU2CONSOL_SOCIAL_HISTORY_SECTION_SMOKING_STATUS_OBSERVATION,
						 Mu2consolPlugin.INSTANCE.getString("SocialHistorySectionMU2CONSOLSocialHistorySectionSmokingStatusObservation"),
						 new Object [] { socialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getMu2consolSmokingStatusObservations(SocialHistorySection)
	 * <em>Get Mu2consol Smoking Status Observations</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMu2consolSmokingStatusObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MU2CONSOL_SMOKING_STATUS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mu2consol::SmokingStatusObservation)).oclAsType(mu2consol::SmokingStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMu2consolSmokingStatusObservations(SocialHistorySection) <em>Get Mu2consol Smoking Status Observations</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMu2consolSmokingStatusObservations(SocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MU2CONSOL_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not
	 * observation.oclIsUndefined() and
	 * observation.oclIsKindOf(mu2consol::SmokingStatusObservation
	 * )).oclAsType(mu2consol::SmokingStatusObservation)
	 * 
	 * @param socialHistorySection
	 *            The receiving '<em><b>Social History Section</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static EList<SmokingStatusObservation> getMu2consolSmokingStatusObservations(
			SocialHistorySection socialHistorySection) {
		if (GET_MU2CONSOL_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.SOCIAL_HISTORY_SECTION, Mu2consolPackage.Literals.SOCIAL_HISTORY_SECTION.getEAllOperations().get(69));
			try {
				GET_MU2CONSOL_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MU2CONSOL_SMOKING_STATUS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MU2CONSOL_SMOKING_STATUS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SmokingStatusObservation> result = (Collection<SmokingStatusObservation>) query.evaluate(socialHistorySection);
		return new BasicEList.UnmodifiableEList<SmokingStatusObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * <em>Validate Social History Section Template Id</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #validateSocialHistorySectionTemplateId(SocialHistorySection,
	 *      org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.17')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root =
	 * '2.16.840.1.113883.10.20.22.2.17')
	 * 
	 * @param socialHistorySection
	 *            The receiving '<em><b>Social History Section</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateSocialHistorySectionTemplateId(
			SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 Mu2consolPlugin.INSTANCE.getString("SocialHistorySectionSocialHistorySectionTemplateId"),
						 new Object [] { socialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

} // SocialHistorySectionOperations