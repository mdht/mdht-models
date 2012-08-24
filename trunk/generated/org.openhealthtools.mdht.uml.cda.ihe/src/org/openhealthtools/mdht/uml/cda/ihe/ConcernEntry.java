/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage#getConcernEntry()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ConcernEntryTemplateId ConcernEntryEffectiveTimeLowHigh ConcernEntryHasRelatedObservations ConcernEntryRelatedObservationsTypeCode ConcernEntryHasRelatedReferencesTypeCode ConcernEntryEffectiveTime' templateId.root='1.3.6.1.4.1.19376.1.5.3.1.4.5.1'"
 * @generated
 */
public interface ConcernEntry extends ProblemAct {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.effectiveTime.low.oclIsUndefined()\r\n   and ((self.statusCode.code = \'completed\' or self.statusCode.code = \'aborted\') implies not self.effectiveTime.high.oclIsUndefined())\r\n   and ((self.statusCode.code <> \'completed\' and self.statusCode.code <> \'aborted\') implies self.effectiveTime.high.oclIsUndefined())'"
   * @generated
   */
	boolean validateConcernEntryEffectiveTimeLowHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  \'1.3.6.1.4.1.19376.1.5.3.1.4.5\') or self.entryRelationship.observation.templateId->exists(id : datatypes::II | id.root =  \'1.3.6.1.4.1.19376.1.5.3.1.4.6\')'"
   * @generated
   */
	boolean validateConcernEntryHasRelatedObservations(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er|er.typeCode <> vocab::x_ActRelationshipEntryRelationship::SUBJ)->isEmpty()'"
   * @generated
   */
	boolean validateConcernEntryRelatedObservationsTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->forAll(r | r.typeCode = vocab::x_ActRelationshipExternalReference::REFR)'"
   * @generated
   */
	boolean validateConcernEntryHasRelatedReferencesTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'1.3.6.1.4.1.19376.1.5.3.1.4.5.1\')'"
   * @generated
   */
	boolean validateConcernEntryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
   * @generated
   */
	boolean validateConcernEntryEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ConcernEntry init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConcernEntry init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ConcernEntry
