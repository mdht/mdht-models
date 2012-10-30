/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.EyesSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routine Eye Exam Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage#getRoutineEyeExamSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='RoutineEyeExamSectionTemplateId' templateId.root='1.3.6.1.4.1.19376.1.12.1.2.6'"
 * @generated
 */
public interface RoutineEyeExamSection extends EyesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoutineEyeExamSection init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RoutineEyeExamSection init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // RoutineEyeExamSection
