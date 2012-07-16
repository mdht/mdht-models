/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.Subject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family History Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getFamilyHistorySubject()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='FamilyHistorySubjectRelatedSubjectClassCode FamilyHistorySubjectRelatedSubjectCode FamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode' constraints.validation.warning='FamilyHistorySubjectRelatedSubjectCodeValueSet FamilyHistorySubjectRelatedSubjectSubject FamilyHistorySubjectRelatedSubjectSubjectId FamilyHistorySubjectRelatedSubjectSubjectBirthTime' constraints.validation.info='FamilyHistorySubjectRelatedSubjectSubjectDeceasedInd FamilyHistorySubjectRelatedSubjectSubjectDeceasedTime'"
 * @generated
 */
public interface FamilyHistorySubject extends Subject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.isClassCodeDefined() and self.relatedSubject.classCode = vocab::x_DocumentSubject::PRS
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.isClassCodeDefined() and self.relatedSubject.classCode = vocab::x_DocumentSubject::PRS'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject->size() = 1 implies self.relatedSubject.code->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject->size() = 1 implies self.relatedSubject.code->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.code->size() = 1 implies self.relatedSubject.code.codeSystem = '2.16.840.1.113883.5.111'
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.code->size() = 1 implies self.relatedSubject.code.codeSystem = \'2.16.840.1.113883.5.111\''"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.subject->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectSubject(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject.sDTCId->size() > 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.subject.sDTCId->size() > 0'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectSubjectId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies (self.relatedSubject.subject.administrativeGenderCode->size() = 1 and self.relatedSubject.subject.administrativeGenderCode.codeSystem = '2.16.840.1.113883.5.1')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.subject->size() = 1 implies (self.relatedSubject.subject.administrativeGenderCode->size() = 1 and self.relatedSubject.subject.administrativeGenderCode.codeSystem = \'2.16.840.1.113883.5.1\')'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectSubjectAdmGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.birthTime->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.birthTime->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectSubjectBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedInd->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedInd->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedInd(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedTime->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedSubject.subject->size() = 1 implies self.relatedSubject.subject.sDTCDeceasedTime->size() = 1'"
	 * @generated
	 */
	boolean validateFamilyHistorySubjectRelatedSubjectSubjectDeceasedTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySubject init();
} // FamilyHistorySubject
