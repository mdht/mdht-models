/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrClinicalInformationSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.util.MeningococcalValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phcr Clinical Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MeningococcalPhcrClinicalInformationSectionImpl extends PhcrClinicalInformationSectionImpl implements MeningococcalPhcrClinicalInformationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeningococcalPhcrClinicalInformationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Phcr Clinical Information Section Meningococcal Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(meningococcal::MeningococcalCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Phcr Clinical Information Section Meningococcal Case Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION_MENINGOCOCCAL_CASE_OBSERVATION,
						 MeningococcalPlugin.INSTANCE.getString("MeningococcalPhcrClinicalInformationSectionMeningococcalCaseObservation"),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMeningococcalCaseObservation() <em>Get Meningococcal Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalCaseObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENINGOCOCCAL_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(meningococcal::MeningococcalCaseObservation))->asSequence()->any(true).oclAsType(meningococcal::MeningococcalCaseObservation)";

	/**
	 * The cached OCL query for the '{@link #getMeningococcalCaseObservation() <em>Get Meningococcal Case Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalCaseObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENINGOCOCCAL_CASE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeningococcalCaseObservation getMeningococcalCaseObservation() {
		if (GET_MENINGOCOCCAL_CASE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION, MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(69));
			try {
				GET_MENINGOCOCCAL_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MENINGOCOCCAL_CASE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENINGOCOCCAL_CASE_OBSERVATION__EOCL_QRY);
		return (MeningococcalCaseObservation) query.evaluate(this);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.59')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhcrClinicalInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeningococcalPhcrClinicalInformationSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MeningococcalPhcrClinicalInformationSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MeningococcalPhcrClinicalInformationSectionImpl
