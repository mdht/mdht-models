/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.operations;

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
import org.openhealthtools.mdht.uml.cda.ccd.operations.SocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.GeotemporalHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.util.PhcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionGeotemporalHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Geotemporal History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Most Recent Time Arrived In USA Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionRaceObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Race Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionOccupationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Occupation Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validatePhcrSocialHistorySectionPregnancyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Pregnancy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getGeotemporalHistoryObservations() <em>Get Geotemporal History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getMostRecentTimeArrivedInUSAObservation() <em>Get Most Recent Time Arrived In USA Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getRaceObservations() <em>Get Race Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getOccupationObservations() <em>Get Occupation Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#getPregnancyObservations() <em>Get Pregnancy Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhcrSocialHistorySectionOperations extends SocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrSocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionCode(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionCode(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '29762-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionCode(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionCode(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '29762-2' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrSocialHistorySectionCode(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_CODE,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionCode"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionTitle(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionTitle(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Social History')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionTitle(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionTitle(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (self.title.getText() = 'Social History')
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePhcrSocialHistorySectionTitle(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_TITLE,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionTitle"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionText(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionText(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionText(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionText(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePhcrSocialHistorySectionText(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_TEXT,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionText"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionGeotemporalHistoryObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Geotemporal History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionGeotemporalHistoryObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::GeotemporalHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionGeotemporalHistoryObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Geotemporal History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionGeotemporalHistoryObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::GeotemporalHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePhcrSocialHistorySectionGeotemporalHistoryObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_GEOTEMPORAL_HISTORY_OBSERVATION,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionGeotemporalHistoryObservation"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Most Recent Time Arrived In USA Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::MostRecentTimeArrivedInUSAObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Most Recent Time Arrived In USA Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::MostRecentTimeArrivedInUSAObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionMostRecentTimeArrivedInUSAObservation"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionRaceObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Race Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionRaceObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::RaceObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionRaceObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Race Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionRaceObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::RaceObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePhcrSocialHistorySectionRaceObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_RACE_OBSERVATION,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionRaceObservation"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionOccupationObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Occupation Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionOccupationObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::OccupationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionOccupationObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Occupation Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionOccupationObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::OccupationObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePhcrSocialHistorySectionOccupationObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_OCCUPATION_OBSERVATION,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionOccupationObservation"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrSocialHistorySectionPregnancyObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Pregnancy Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionPregnancyObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PregnancyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrSocialHistorySectionPregnancyObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Social History Section Pregnancy Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrSocialHistorySectionPregnancyObservation(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(phcr::PregnancyObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePhcrSocialHistorySectionPregnancyObservation(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__PHCR_SOCIAL_HISTORY_SECTION_PREGNANCY_OBSERVATION,
						 PhcrPlugin.INSTANCE.getString("PhcrSocialHistorySectionPregnancyObservation"),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeotemporalHistoryObservations(PhcrSocialHistorySection) <em>Get Geotemporal History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeotemporalHistoryObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GEOTEMPORAL_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::GeotemporalHistoryObservation)).oclAsType(phcr::GeotemporalHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getGeotemporalHistoryObservations(PhcrSocialHistorySection) <em>Get Geotemporal History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeotemporalHistoryObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GEOTEMPORAL_HISTORY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::GeotemporalHistoryObservation)).oclAsType(phcr::GeotemporalHistoryObservation)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<GeotemporalHistoryObservation> getGeotemporalHistoryObservations(PhcrSocialHistorySection phcrSocialHistorySection) {
		if (GET_GEOTEMPORAL_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION, PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(75));
			try {
				GET_GEOTEMPORAL_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_GEOTEMPORAL_HISTORY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GEOTEMPORAL_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<GeotemporalHistoryObservation> result = (Collection<GeotemporalHistoryObservation>) query.evaluate(phcrSocialHistorySection);
		return new BasicEList.UnmodifiableEList<GeotemporalHistoryObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection) <em>Get Most Recent Time Arrived In USA Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::MostRecentTimeArrivedInUSAObservation))->asSequence()->first().oclAsType(phcr::MostRecentTimeArrivedInUSAObservation)";

	/**
	 * The cached OCL query for the '{@link #getMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection) <em>Get Most Recent Time Arrived In USA Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::MostRecentTimeArrivedInUSAObservation))->asSequence()->first().oclAsType(phcr::MostRecentTimeArrivedInUSAObservation)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MostRecentTimeArrivedInUSAObservation getMostRecentTimeArrivedInUSAObservation(PhcrSocialHistorySection phcrSocialHistorySection) {
		if (GET_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION, PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(76));
			try {
				GET_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION__EOCL_QRY);
		return (MostRecentTimeArrivedInUSAObservation) query.evaluate(phcrSocialHistorySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRaceObservations(PhcrSocialHistorySection) <em>Get Race Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaceObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RACE_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::RaceObservation)).oclAsType(phcr::RaceObservation)";

	/**
	 * The cached OCL query for the '{@link #getRaceObservations(PhcrSocialHistorySection) <em>Get Race Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaceObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RACE_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::RaceObservation)).oclAsType(phcr::RaceObservation)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<RaceObservation> getRaceObservations(PhcrSocialHistorySection phcrSocialHistorySection) {
		if (GET_RACE_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION, PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(77));
			try {
				GET_RACE_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_RACE_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RACE_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RaceObservation> result = (Collection<RaceObservation>) query.evaluate(phcrSocialHistorySection);
		return new BasicEList.UnmodifiableEList<RaceObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getOccupationObservations(PhcrSocialHistorySection) <em>Get Occupation Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupationObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OCCUPATION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::OccupationObservation)).oclAsType(phcr::OccupationObservation)";

	/**
	 * The cached OCL query for the '{@link #getOccupationObservations(PhcrSocialHistorySection) <em>Get Occupation Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccupationObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OCCUPATION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::OccupationObservation)).oclAsType(phcr::OccupationObservation)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<OccupationObservation> getOccupationObservations(PhcrSocialHistorySection phcrSocialHistorySection) {
		if (GET_OCCUPATION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION, PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(78));
			try {
				GET_OCCUPATION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_OCCUPATION_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OCCUPATION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<OccupationObservation> result = (Collection<OccupationObservation>) query.evaluate(phcrSocialHistorySection);
		return new BasicEList.UnmodifiableEList<OccupationObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getPregnancyObservations(PhcrSocialHistorySection) <em>Get Pregnancy Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PREGNANCY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PregnancyObservation)).oclAsType(phcr::PregnancyObservation)";

	/**
	 * The cached OCL query for the '{@link #getPregnancyObservations(PhcrSocialHistorySection) <em>Get Pregnancy Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyObservations(PhcrSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PREGNANCY_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(phcr::PregnancyObservation)).oclAsType(phcr::PregnancyObservation)
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<PregnancyObservation> getPregnancyObservations(PhcrSocialHistorySection phcrSocialHistorySection) {
		if (GET_PREGNANCY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION, PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(79));
			try {
				GET_PREGNANCY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PREGNANCY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PregnancyObservation> result = (Collection<PregnancyObservation>) query.evaluate(phcrSocialHistorySection);
		return new BasicEList.UnmodifiableEList<PregnancyObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.22')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(PhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.22')
	 * @param phcrSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSocialHistorySectionTemplateId(PhcrSocialHistorySection phcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhcrPackage.Literals.PHCR_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phcrSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhcrValidator.DIAGNOSTIC_SOURCE,
						 PhcrValidator.PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(phcrSocialHistorySection, context) }),
						 new Object [] { phcrSocialHistorySection }));
			}
			return false;
		}
		return true;
	}

} // PhcrSocialHistorySectionOperations